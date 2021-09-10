package tp3;

public class Cupom {
	
	
	private int desconto;
	private String condicaoDeUso;
	private int quantidadeDisponivel;
	
	
	public Cupom(int desconto, String condicaoDeUso, int quantidadeDisponivel) {
		
		this.desconto = desconto;
		
		this.condicaoDeUso = condicaoDeUso;
		
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	
	@Override
	public String toString() {
		return "Cupom [desconto=" + desconto + ", condicaoDeUso=" + condicaoDeUso + ", quantidadeDisponivel="
				+ quantidadeDisponivel + "]";	
	}
	


	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public String getCondicaoDeUso() {
		return condicaoDeUso;
	}
	public void setCondicaoDeUso(String condicaoDeUso) {
		this.condicaoDeUso = condicaoDeUso;
	}
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
}
