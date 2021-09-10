package tp3;

public class Cliente extends Pessoa {
	
	private String telefone;

	public Cliente (String nome, String endereco, String cpf,String telefone) {
		
		super(nome, endereco, cpf);
		this.telefone = telefone;
		
	}

	
	//fun��o para poder realizar o print das informa��es
		public String toString () {
			return "Dados do Cliente : \nNome = "+getNome()+"\nEndere�o = " +getEndereco()+
					"\nCPF = "+getCpf()+"\ntelefone = "+telefone;
		}
	
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
