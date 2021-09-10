package tp3;

public class Entregador extends Pessoa {
	
	private String modalidade;
	private int nota;
	private ContaBancaria conta;

	public Entregador(String nome, String endereco, String cpf,String modalidade, int nota,ContaBancaria conta) {
		super(nome, endereco, cpf);
		this.modalidade = modalidade;
		this.nota = nota;
		this.conta = conta;
		
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
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
