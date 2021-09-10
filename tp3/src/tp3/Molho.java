package tp3;

public class Molho extends Comida{

private String tipo;
	
	public Molho(char tamanho, String descricao, double preco, String tipo) {
		
		super (tamanho,descricao,preco);
		this.tipo = tipo;
		
	}
	//função para poder realizar o print das informações
	public String toString () {
		return "Especificações do molho: \nTamanho = "+getTamanho()+"\nDescrição = " +getDescricao()+
				"\nPreço = "+getPreco()+"\nTipo = "+tipo;
	}
	
	
	//getter e setter do corte do frango
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
