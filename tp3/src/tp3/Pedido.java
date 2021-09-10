package tp3;

import java.util.ArrayList;

public class Pedido {

	private int numero;
	static private ArrayList<Comida> itens;
	private int subtotal;
	private String metodoDePagamento;
	private Boolean retirada;
	
	public Pedido(int numero, ArrayList<Comida> itens, int subtotal, String metodoDePagamento, Boolean retirada) {
		this.numero = numero;
		itens = new ArrayList<Comida>();
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

	public ArrayList<Comida> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Comida> itens) {
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
