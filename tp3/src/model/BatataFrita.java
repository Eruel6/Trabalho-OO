package model;

/**
 * Classe filha da classe comida, utilizada para definir um objeto Batata Frita.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class BatataFrita extends Comida {

	private String acompanhamento;

	/**
	 * Construtor da classe Batata Frita.
	 * 
	 * @param tamanho
	 * @param descricao
	 * @param preco
	 * @param acompanhamento
	 */

	public BatataFrita(char tamanho, String descricao, double preco, String acompanhamento) {

		super(tamanho, descricao, preco);
		this.acompanhamento = acompanhamento;

	}

	// fun��o para poder realizar o print das informa��es
	@Override
	public String toString() {
		return "Especifica��es da batata frita : \nTamanho = " + getTamanho() + "\nDescri��o = " + getDescricao()
				+ "\nPre�o = " + getPreco() + "\nacompanhamento(s) = " + acompanhamento;
	}

	// getter e setter da batata frita
	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
}