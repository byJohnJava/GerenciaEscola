package model;

public class Funcionario {

	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private Data dataNascimento;
	private String telefone;
	private Endereco endereco;
	private double salario;

//	public void exibe() {
//		System.out.println("Nome do Funcionário: " + nome);
//		System.out.println("CPF do Funcionário: " + cpf);
//		System.out.println("Salário do Funcionário: " + salario);
//	}
//	
	public Funcionario() {
		System.out.println("Funcionário criado");
	}

	public Funcionario(int id, String nome, String cpf, String rg, Data dataNascimento, String telefone,
			Endereco endereco, double salario) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
