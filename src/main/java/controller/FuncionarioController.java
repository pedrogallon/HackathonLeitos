package controller;

import java.util.List;

import com.google.inject.Inject;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import dao.FuncionarioDAO;
import model.Funcionario;

@Resource
public class FuncionarioController {

	@Inject
	Result result;

	@Path("/index")
	public void index() {
		result.use(Results.json()).withoutRoot().from("Endereco Inválido").serialize();
	}

	@Path("/login")
	public void login(String email, String senha) {
		FuncionarioDAO funcarioDAO = new FuncionarioDAO();
		try {
			Funcionario funcionario = funcarioDAO.getFuncionarioOnLogin(email, senha);
			if (funcionario != null) {
				result.use(Results.json()).withoutRoot().from(funcionario).serialize();
			}else {
				result.use(Results.json()).withoutRoot().from("NOTIFICACAO: Funcionario inválido!").serialize();
			}

		} catch (Exception e) {
			result.use(Results.json()).withoutRoot().from("ERRO: "+e.getMessage()).serialize();
		}

	}


	@Path("/logout")
	public void logout() {

	}

	

	@Path("/createFuncionario")
	public void createFuncionario(Funcionario funcionario) {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		try {
			funcionarioDAO.createFuncionario(funcionario);
			result.use(Results.json()).withoutRoot().from("NOTIFICACAO: Funcionario criado com sucesso").serialize();
		} catch (Exception e) {
			result.use(Results.json()).withoutRoot().from("ERRO: "+e.getMessage()).serialize();
		}
	}

	@Path("/updateFuncionario")
	public void updateFuncionario(Funcionario funcionario) {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		try {
			funcionarioDAO.updateFuncionario(funcionario);
			result.use(Results.json()).withoutRoot().from("NOTIFICACAO: Alterado com sucesso").serialize();
		} catch (Exception e) {
			result.use(Results.json()).withoutRoot().from("ERRO: "+e.getMessage()).serialize();
		}
	}

	@Path("/getFuncionarios")
	public void getFuncionarios() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		try {
			List<Funcionario> funcionarios = funcionarioDAO.getFuncionarios();
			result.use(Results.json()).withoutRoot().from(funcionarios).serialize();
		} catch (Exception e) {
			result.use(Results.json()).withoutRoot().from("ERRO: "+e.getMessage()).serialize();
		}
	}

	
	
	@Path("/getFuncionarioById")
	public void getfuncionarioById(int id) {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		try {
			Funcionario funcionario = funcionarioDAO.getFuncionarioById(id);
			result.use(Results.json()).withoutRoot().from(funcionario).serialize();
		} catch (Exception e) {
			result.use(Results.json()).withoutRoot().from("ERRO: ID inexistente para Usuário; ID: "+id+";	\n"+e.getMessage()).serialize();
		}
	}
}

