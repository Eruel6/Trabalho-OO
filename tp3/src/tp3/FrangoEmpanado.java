package tp3;

public class FrangoEmpanado extends Comida {

	private String corteDoFrango;
	
	public FrangoEmpanado(char tamanho, String descricao, float preco, String corteDoFrango) {
		
		super (tamanho,descricao,preco);
		this.corteDoFrango = corteDoFrango;
		
	}
	//fun��o para poder realizar o print das informa��es
	public String toString (String tamanho, String descricao, String preco) {
		return "Especifica��es do frango: \nTamanho = "+tamanho+"\nDescri��o = " +descricao+
				"\npre�o = "+preco+"\nCorte do Frango = "+corteDoFrango;
	}
	
	
	//getter e setter do corte do frango
	protected String getCorteDoFrango() {
		return corteDoFrango;
	}

	protected void setCorteDoFrango(String corteDoFrango) {
		this.corteDoFrango = corteDoFrango;
	}
		
}
