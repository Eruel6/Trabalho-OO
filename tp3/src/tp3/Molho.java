package tp3;

public class Molho extends Comida{

private String tipo;
	
	public Molho(char tamanho, String descricao, double preco, String tipo) {
		
		super (tamanho,descricao,preco);
		this.tipo = tipo;
		
	}
	//fun��o para poder realizar o print das informa��es
	public String toString (String tamanho, String descricao, String preco) {
		return "Especifica��es do frango: \nTamanho = "+getTamanho()+"\nDescri��o = " +getDescricao()+
				"\npre�o = "+getPreco()+"\nTipo = "+tipo;
	}
	
	
	//getter e setter do corte do frango
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
