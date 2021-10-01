package model;

public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String cpf;

	protected Pessoa(String nome, String endereco, String cpf) {

		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;

	}

	@Override
	public abstract String toString();

	// getter e setter de nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// getter e setter de endereço
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// ggetter e setter de CPF
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}