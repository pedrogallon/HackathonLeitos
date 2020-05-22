package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.Funcionario;
import service.FuncionarioMapper;

public class FuncionarioDAO {
	private SqlSessionFactory sqlSessionFactory;

	public FuncionarioDAO() {
		sqlSessionFactory = ConnectionFactory.getSqlSessionFactory();
	}
	
	public void createFuncionario(Funcionario funcionario) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			FuncionarioMapper FuncionarioMapper = session.getMapper(FuncionarioMapper.class);
			FuncionarioMapper.createFuncionario(funcionario);
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void updateFuncionario(Funcionario funcionario) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			FuncionarioMapper FuncionarioMapper = session.getMapper(FuncionarioMapper.class);
			FuncionarioMapper.updateFuncionario(funcionario);
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public List<Funcionario> getFuncionarios() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			FuncionarioMapper FuncionarioMapper = session.getMapper(FuncionarioMapper.class);
			List<Funcionario> Funcionario = FuncionarioMapper.getFuncionarios();
			return Funcionario;
		} finally {
			session.close();
		}
	}
	
	public Funcionario getFuncionarioById(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			FuncionarioMapper FuncionarioMapper = session.getMapper(FuncionarioMapper.class);
			Funcionario Funcionario = FuncionarioMapper.getFuncionarioById(id);
			return Funcionario;
		} finally {
			session.close();
		}
	}
	
	public Funcionario getFuncionarioOnLogin(String email, String senha) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			FuncionarioMapper FuncionarioMapper = session.getMapper(FuncionarioMapper.class);
			Funcionario Funcionario = FuncionarioMapper.getFuncionarioOnLogin(email, senha);
			return Funcionario;
		} finally {
			session.close();
		}
	}
}
