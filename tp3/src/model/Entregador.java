package model;

public class Entregador extends Pessoa {

	private String modalidade;
	private double nota;
	private ContaBancaria conta;

	public Entregador(String nome, String endereco, String cpf, String modalidade, double nota, ContaBancaria conta) {
		super(nome, endereco, cpf);
		this.modalidade = modalidade;
		this.nota = nota;
		this.conta = conta;

	}

	// função para poder realizar o print das informações
	public String toString() {
		return "Dados do Entregador : \nNome = " + getNome() + "\nEndereço = " + getEndereco() + "\nCPF = " + getCpf()
				+ "\nModalidade = " + modalidade + "\nNota = " + nota + "\nConta Bancaria = " + conta.getConta();
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
