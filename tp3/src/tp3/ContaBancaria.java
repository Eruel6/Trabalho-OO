package tp3;

public class ContaBancaria  {

	private String banco;
	private int agnecia;
	private String conta;
	
	protected ContaBancaria(String banco, int agnecia, String conta) {
		super();
		this.banco = banco;
		this.agnecia = agnecia;
		this.conta = conta;
	}
	
	//getter e setter de banco
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	//getter e setter de agência
	public int getAgnecia() {
		return agnecia;
	}
	public void setAgnecia(int agnecia) {
		this.agnecia = agnecia;
	}
	
	//getter e setter de conta
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}

}
