package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import model.Funcionario;


//Define parametros utilizados em data.Funcionario.xml
public interface FuncionarioMapper {
	
	//	retorna todos os Funcionarios
	List<Funcionario> getFuncionarios();

	//	retorna Funcionario por id
	Funcionario getFuncionarioById(
			@Param("id") int id);
	
	//	retorna Funcionario com login
	Funcionario getFuncionarioOnLogin(
			@Param("email") String email,
			@Param("senha") String senha);

	//cria Funcionario (Segundo Semestre)
	void createFuncionario(
			@Param("funcionario") Funcionario funcionario);
	
	//atualiza Funcionario (Segundo Semestre)
	void updateFuncionario(
			@Param("funcionario") Funcionario funcionario);
}
