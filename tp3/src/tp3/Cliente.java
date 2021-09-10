package tp3;

public class Cliente extends Pessoa {
	
	private String telefone;

	public Cliente (String nome, String endereco, String cpf,String telefone) {
		
		super(nome, endereco, cpf);
		this.telefone = telefone;
		
	}

	
	//função para poder realizar o print das informações
		public String toString () {
			return "Dados do Cliente : \nNome = "+getNome()+"\nEndereço = " +getEndereco()+
					"\nCPF = "+getCpf()+"\ntelefone = "+telefone;
		}
	
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
