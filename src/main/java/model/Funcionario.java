package model;

public class Funcionario{

	private int id;
	private String cpf;
	private String tipo;
	private String nome;
	private String senha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Funcionario(int id, String cpf, String tipo, String nome, String senha) {
		this.id = id;
		this.cpf = cpf;
		this.tipo = tipo;
		this.nome = nome;
		this.senha = senha;
	}
	
	public Funcionario() {

	}
	
	
	
		
}

