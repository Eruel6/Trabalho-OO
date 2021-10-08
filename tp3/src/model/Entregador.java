package model;

/**
 * Classe filha da classe pessoa que define um entregador.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Entregador extends Pessoa {

	private String modalidade;
	private double nota;
	private ContaBancaria conta;

	/**
	 * Construtor da classe Entregador.
	 * 
	 * @param nome
	 * @param endereco
	 * @param cpf
	 * @param modalidade
	 * @param nota
	 * @param conta
	 */

	public Entregador(String nome, String endereco, String cpf, String modalidade, double nota, ContaBancaria conta) {
		super(nome, endereco, cpf);
		this.modalidade = modalidade;
		this.nota = nota;
		this.conta = conta;

	}

	// função para poder realizar o print das informações
	@Override
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