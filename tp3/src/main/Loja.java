package main;

import java.util.ArrayList;

import model.Cliente;
import model.ContaBancaria;
import model.Entregador;
import model.FrangoEmpanado;
import model.Pedido;

public class Loja {

	private String cnpj;
	private final ArrayList<Cliente> clientes;
	private final ArrayList<Entregador> entregadores;

	private Loja(String cnpj) {
		this.cnpj = cnpj;
		this.clientes = new ArrayList<>();
		this.entregadores = new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Entregador> getEntregadores() {
		return entregadores;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public static void main(String[] args) {
		Loja minhaLoja = new Loja("13.951.785/0001-21");

		minhaLoja.getClientes().add(new Cliente("Fagner III", "Brasilia", "025.951.753-46", "(61) 94545-6362"));

		minhaLoja.getEntregadores().add(new Entregador("Kléber II", "Plano Piloto", "951.254.748-21", "Bicicleta", 4.7,
				new ContaBancaria("BRB", 0001, "15985245-9")));

		minhaLoja.getClientes().get(0).getPedidos()
				.add(new Pedido(1, "crédito", true, minhaLoja.getEntregadores().get(0)));
		minhaLoja.getClientes().get(0).getPedidos().get(0)
				.add(new FrangoEmpanado('P', "Um delicioso Frango", 17.87, "Peito"));

		System.out.println(minhaLoja);
	}
}
