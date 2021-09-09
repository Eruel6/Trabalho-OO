package tp3;

public class FrangoEmpanado extends Comida {

	private String corteDoFrango;
	
	public FrangoEmpanado(char tamanho, String descricao, float preco, String corteDoFrango) {
		
		super (tamanho,descricao,preco);
		this.corteDoFrango = corteDoFrango;
		
	}
	//função para poder realizar o print das informações
	public String toString (String tamanho, String descricao, String preco) {
		return "Especificações do frango: \nTamanho = "+tamanho+"\nDescrição = " +descricao+
				"\npreço = "+preco+"\nCorte do Frango = "+corteDoFrango;
	}
	
	
	//getter e setter do corte do frango
	protected String getCorteDoFrango() {
		return corteDoFrango;
	}

	protected void setCorteDoFrango(String corteDoFrango) {
		this.corteDoFrango = corteDoFrango;
	}
		
}
