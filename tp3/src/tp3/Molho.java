package tp3;

public class Molho extends Comida{

private String tipo;
	
	public Molho(char tamanho, String descricao, float preco, String tipo) {
		
		super (tamanho,descricao,preco);
		this.tipo = tipo;
		
	}
	//função para poder realizar o print das informações
	public String toString (String tamanho, String descricao, String preco) {
		return "Especificações do frango: \nTamanho = "+tamanho+"\nDescrição = " +descricao+
				"\npreço = "+preco+"\nTipo = "+tipo;
	}
	
	
	//getter e setter do corte do frango
	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
