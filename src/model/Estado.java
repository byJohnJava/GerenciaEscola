package model;

public class Estado {
	
	private String nome;
	private String uf;
	
	public Estado() {
		
	}

	public Estado(String nome, String uf) {
		this.nome = nome;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
}
