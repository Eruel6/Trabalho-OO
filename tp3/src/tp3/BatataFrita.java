package tp3;

public class BatataFrita extends Comida {

private String acompanhamento;
	
	public BatataFrita(char tamanho, String descricao, double preco, String acompanhamento) {
		
		super (tamanho,descricao,preco);
		this.acompanhamento = acompanhamento;
		
	}
	//função para poder realizar o print das informações
	public String toString () {
		return "Especificações da batata frita : \nTamanho = "+getTamanho()+"\nDescrição = " +getDescricao()+
				"\n preço = "+getPreco()+"\nacompanhamento(s) = "+acompanhamento;
	}
	
	
	//getter e setter da batata frita
	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
}
