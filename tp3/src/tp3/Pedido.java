package tp3;

public class Pedido {

	private int numero;
	private String itens;
	private int subtotal;
	private String metodoDePagamento;
	private Boolean retirada;
	
	public Pedido(int numero, String itens, int subtotal, String metodoDePagamento, Boolean retirada) {
		super();
		this.numero = numero;
		this.itens = itens;
		this.subtotal = subtotal;
		this.metodoDePagamento = metodoDePagamento;
		this.retirada = retirada;
	}
	
	
	

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", itens=" + itens + ", subtotal=" + subtotal + ", metodoDePagamento="
				+ metodoDePagamento + ", retirada=" + retirada + "]";
	}




	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public Boolean getRetirada() {
		return retirada;
	}

	public void setRetirada(Boolean retirada) {
		this.retirada = retirada;
	}

}
