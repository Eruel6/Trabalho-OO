package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {

	private String telefone;
	private final ArrayList<Pedido> pedidos;

	public Cliente(String nome, String endereco, String cpf, String telefone) {

		super(nome, endereco, cpf);
		this.telefone = telefone;
		this.pedidos = new ArrayList<>();

	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	// função para poder realizar o print das informações
	public String toString() {
		return "Dados do Cliente : \nNome = " + getNome() + "\nEndereço = " + getEndereco() + "\nCPF = " + getCpf()
				+ "\nTelefone = " + telefone + "\nPedidos do cliente: " + pedidos;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
