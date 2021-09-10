package model;

public class ContaBancaria {

	private String banco;
	private int agencia;
	private String conta;

	public ContaBancaria(String banco, int agencia, String conta) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
	}

	// getter e setter de banco
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	// getter e setter de ag�ncia
	public int getAgnecia() {
		return agencia;
	}

	public void setAgnecia(int agnecia) {
		this.agencia = agnecia;
	}

	// getter e setter de conta
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

}
