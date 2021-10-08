package model;

/**
 * Classe que define o modelo do objeto conta bancaria.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class ContaBancaria {

	private String banco;
	private int agencia;
	private String conta;

	/**
	 * Construtor da classe Conta Bancaria.
	 * 
	 * @param banco
	 * @param agencia
	 * @param conta
	 */

	public ContaBancaria(String banco, int agencia, String conta) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Banco = " + banco + ",\nAgência = " + agencia + ",\nConta = " + conta;

	}

	// getter e setter de banco
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	// getter e setter de agência
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	// getter e setter de conta
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

}