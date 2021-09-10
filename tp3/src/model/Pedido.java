package model;

import java.util.ArrayList;

public class Pedido {

	private int numero;
	private final ArrayList<Comida> itens;
	private double subtotal;
	private String metodoDePagamento;
	private boolean retirada;
	private Entregador entregador;
	private double cupomDeDesconto;

	public Pedido(int numero, String metodoDePagamento, Boolean retirada, Entregador entregador) {
		this.numero = numero;
		this.itens = new ArrayList<Comida>();
		this.subtotal = 0;
		this.metodoDePagamento = metodoDePagamento;
		this.retirada = retirada;
		this.entregador = entregador;
		this.cupomDeDesconto = 0;
	}

	public Pedido(int numero, String metodoDePagamento, Boolean retirada, Entregador entregador,
			double cupomDeDesconto) {
		this.numero = numero;
		this.itens = new ArrayList<Comida>();
		this.subtotal = 0;
		this.metodoDePagamento = metodoDePagamento;
		this.retirada = retirada;
		this.entregador = entregador;
		this.cupomDeDesconto = cupomDeDesconto;
	}

	private double calculaSubtotal() {
		double subtotal = 0;
		for (Comida comida : this.itens) {
			subtotal += comida.getPreco();
		}
		return subtotal - this.cupomDeDesconto;
	}

	public void add(Comida item) {
		this.itens.add(item);
		this.subtotal = calculaSubtotal();
	}

	@Override
	public String toString() {
		return "Número do pedido = " + numero + ",\nItens = " + itens + ",\nSubtotal = " + subtotal
				+ ",\nMetodoDePagamento = " + metodoDePagamento + ",\nRetirada = " + retirada + ",\n" + entregador
				+ "\nValor do cupom de desconto" + cupomDeDesconto;
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

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
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

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	public double getCupomDeDesconto() {
		return cupomDeDesconto;
	}

	public void setCupomDeDesconto(double cupomDeDesconto) {
		this.cupomDeDesconto = cupomDeDesconto;
	}
}
