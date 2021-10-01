package model;

public abstract class Comida {

	private char tamanho;
	private String descricao;
	private double preco;

	protected Comida(char tamanho, String descricao, double preco) {

		this.tamanho = tamanho;
		this.descricao = descricao;
		this.preco = preco;

	}

	@Override
	public abstract String toString();

	// getters e setters do tamanho
	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	// getters e setters da descri��o
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// getters e setters do pre�o
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
