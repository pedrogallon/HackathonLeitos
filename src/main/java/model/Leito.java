package model;

public class Leito {
	private int id;
	private String leito;
	private int numero;
	private String estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLeito() {
		return leito;
	}
	public void setLeito(String leito) {
		this.leito = leito;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Leito(int id, String leito, int numero, String estado) {
		super();
		this.id = id;
		this.leito = leito;
		this.numero = numero;
		this.estado = estado;
	}
	
	
}
