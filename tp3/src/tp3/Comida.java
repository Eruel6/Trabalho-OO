package tp3;

import java.util.ArrayList;

public abstract class Comida {

	
	protected char tamanho;	
	protected String descricao;
	protected float preco;
	
	protected ArrayList<Character> tamanhoSelecionado = new ArrayList<Character>();
	protected ArrayList<String> descricaoDoProduto= new ArrayList<String>();
	protected ArrayList<Float> precoProduto = new ArrayList<Float>();
	
	
	//getters e setters do tamanho 
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
	
}
