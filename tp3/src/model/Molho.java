package model;

/**
 * Classe filha da classe comida, utilizada para definir um objeto Molho.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Molho extends Comida {

	private String tipo;

	/**
	 * Construtor da classe Molho.
	 * 
	 * @param tamanho
	 * @param descricao
	 * @param preco
	 * @param tipo
	 */

	public Molho(char tamanho, String descricao, double preco, String tipo) {

		super(tamanho, descricao, preco);
		this.tipo = tipo;

	}

	// função para poder realizar o print das informações
	@Override
	public String toString() {
		return "Especificações do molho: \nTamanho = " + getTamanho() + "\nDescrição = " + getDescricao() + "\nPreço = "
				+ getPreco() + "\nTipo = " + tipo;
	}

	// getter e setter do corte do frango
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
