package tp3;

public class Entregador extends Pessoa {
	
	private String modalidade;
	private int nota;

	public Entregador(String nome, String endereco, String cpf,String modalidade, int nota) {
		super(nome, endereco, cpf);
		this.modalidade = modalidade;
		this.nota = nota;
		
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
