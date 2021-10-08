package model;

import java.util.ArrayList;

/**
 * Classe filha da classe pessoa que define um cliente, este possui um arraylist
 * de pedidos, visto que podera realizar mais de um pedido.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Cliente extends Pessoa {

	private String telefone;
	private final ArrayList<Pedido> pedidos;

	/**
	 * Construtor da classe Cliente.
	 * 
	 * @param nome
	 * @param endereco
	 * @param cpf
	 * @param telefone
	 */

	public Cliente(String nome, String endereco, String cpf, String telefone) {

		super(nome, endereco, cpf);
		this.telefone = telefone;
		this.pedidos = new ArrayList<>();

	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	// função para poder realizar o print das informações
	@Override
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