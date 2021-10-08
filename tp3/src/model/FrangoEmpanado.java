package model;

/**
 * Classe filha da classe comida, utilizada para definir um objeto Frango
 * Empanado.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class FrangoEmpanado extends Comida {

	private String corteDoFrango;

	/**
	 * Construtor da classe Frango Empanado.
	 * 
	 * @param tamanho
	 * @param descricao
	 * @param preco
	 * @param corteDoFrango
	 */

	public FrangoEmpanado(char tamanho, String descricao, double preco, String corteDoFrango) {

		super(tamanho, descricao, preco);
		this.corteDoFrango = corteDoFrango;

	}
	// função para poder realizar o print das informações

	@Override
	public String toString() {
		return "Especificações do frango: \nTamanho = " + getTamanho() + "\nDescrição = " + getDescricao()
				+ "\nPreço = " + getPreco() + "\nCorte do Frango = " + corteDoFrango;
	}

	// getter e setter do corte do frango
	public String getCorteDoFrango() {
		return corteDoFrango;
	}

	public void setCorteDoFrango(String corteDoFrango) {
		this.corteDoFrango = corteDoFrango;
	}

}