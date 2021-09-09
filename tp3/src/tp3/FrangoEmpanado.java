package tp3;

public class FrangoEmpanado extends Comida {

	private String corteDoFrango;
	
	public FrangoEmpanado(char t, String d, float p, String c) {
		
		tamanho = t;
		descricao = d;
		preco = p;
		corteDoFrango = c;
		
	}
	
	public String toString () {
		return "Especificações do frango: \nTamanho = "+tamanho+"\nDescrição = " +descricao+
				"\npreço é: "+preco+"Corte do Frango é: "+corteDoFrango;
	}

	public char getTamanho() {
		return tamanho;
	}
	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
	//getters e setters da descrição
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//getters e setters do preço
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	protected String getCorteDoFrango() {
		return corteDoFrango;
	}

	protected void setCorteDoFrango(String corteDoFrango) {
		this.corteDoFrango = corteDoFrango;
	}
		
}
