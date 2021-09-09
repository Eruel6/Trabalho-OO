package tp3;

public class BatataFrita extends Comida {

private String acompanhamento;
	
	public BatataFrita(char tamanho, String descricao, float preco, String acompanhamento) {
		
		super (tamanho,descricao,preco);
		this.acompanhamento = acompanhamento;
		
	}
	//fun��o para poder realizar o print das informa��es
	public String toString (String tamanho, String descricao, String preco) {
		return "Especifica��es da batata frita : \nTamanho = "+tamanho+"\nDescri��o = " +descricao+
				"\n pre�o = "+preco+"\nacompanhamento(s) = "+acompanhamento;
	}
	
	
	//getter e setter da batata frita
	protected String getAcompanhamento() {
		return acompanhamento;
	}

	protected void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
}
