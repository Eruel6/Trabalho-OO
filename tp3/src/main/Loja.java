package main;

import java.util.ArrayList;

import model.Cliente;
import model.ContaBancaria;
import model.Entregador;
import model.FrangoEmpanado;
import model.Pedido;
import view.Menu;

public class Loja {

	private String cnpj;
	private final ArrayList<Cliente> clientes;
	private final ArrayList<Entregador> entregadores;

	private Loja(String cnpj) {
		this.cnpj = cnpj;
		this.clientes = new ArrayList<>();
		this.entregadores = new ArrayList<>();
	}

	@Override
	public String toString() {
		return clientes + "\n\n\nEntregadores da Loja\n" + entregadores + ",\nCNPJ da empresa = " + cnpj;
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

	public Pedido consultaPedido(int numeroDesejado) {

		for (Cliente cliente : this.clientes) {
			for (Pedido pedido : cliente.getPedidos()) {
				if (pedido.getNumero() == numeroDesejado) {
					return pedido;
				}
			}
		}
		return null;
	}

	public Entregador consultaEntregador(String nomeDesejado) {

		for (Entregador entregador : this.entregadores) {

			if (entregador.getNome().equalsIgnoreCase(nomeDesejado)) {
				return entregador;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Loja minhaLoja = new Loja("13.951.785/0001-21");

		new Menu().setVisible(true);

		minhaLoja.getClientes().add(new Cliente("Fagner III", "Brasilia", "025.951.753-46", "(61) 94545-6362"));

		minhaLoja.getEntregadores().add(new Entregador("Kléber II", "Plano Piloto", "951.254.748-21", "Bicicleta", 4.7,
				new ContaBancaria("BRB", 0001, "15985245-9")));

		minhaLoja.getClientes().get(0).getPedidos()
				.add(new Pedido(1, "crédito", true, minhaLoja.getEntregadores().get(0), 2.0));
		minhaLoja.getClientes().get(0).getPedidos().get(0)
				.add(new FrangoEmpanado('P', "Um delicioso Frango", 17.87, "Peito"));

		System.out.println(minhaLoja);
		System.out.println();
		System.out.println(minhaLoja.consultaPedido(1));
		System.out.println();
		System.out.println(minhaLoja.consultaEntregador("Kléber II"));
	}
}
