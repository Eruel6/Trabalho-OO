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
		return "Especifica��es do frango: \nTamanho = "+tamanho+"\nDescri��o = " +descricao+
				"\npre�o �: "+preco+"Corte do Frango �: "+corteDoFrango;
	}

	public char getTamanho() {
		return tamanho;
	}
	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
	//getters e setters da descri��o
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//getters e setters do pre�o
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
