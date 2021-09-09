package tp3;

public class FrangoEmpanado extends Comida {

	private String corteDoFrango;
	
	public FrangoEmpanado(char tamanho, String descricao, double preco, String corteDoFrango) {
		
		super (tamanho,descricao,preco);
		this.corteDoFrango = corteDoFrango;
		
	}
	//fun��o para poder realizar o print das informa��es
	public String toString (String tamanho, String descricao, String preco) {
		return "Especifica��es do frango: \nTamanho = "+getTamanho()+"\nDescri��o = " +getDescricao()+
				"\npre�o = "+getPreco()+"\nCorte do Frango = "+corteDoFrango;
	}
	
	
	//getter e setter do corte do frango
	public String getCorteDoFrango() {
		return corteDoFrango;
	}

	public void setCorteDoFrango(String corteDoFrango) {
		this.corteDoFrango = corteDoFrango;
	}
		
}
