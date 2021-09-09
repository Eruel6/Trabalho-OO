package tp3;

public class FrangoEmpanado extends Comida {

	private String corteDoFrango;
	
	public FrangoEmpanado(char tamanho, String descricao, double preco, String corteDoFrango) {
		
		super (tamanho,descricao,preco);
		this.corteDoFrango = corteDoFrango;
		
	}
	//função para poder realizar o print das informações
	public String toString (String tamanho, String descricao, String preco) {
		return "Especificações do frango: \nTamanho = "+getTamanho()+"\nDescrição = " +getDescricao()+
				"\npreço = "+getPreco()+"\nCorte do Frango = "+corteDoFrango;
	}
	
	
	//getter e setter do corte do frango
	public String getCorteDoFrango() {
		return corteDoFrango;
	}

	public void setCorteDoFrango(String corteDoFrango) {
		this.corteDoFrango = corteDoFrango;
	}
		
}
