package database;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Entregador;

public abstract class Dados {

	private static final String cnpj = "13.951.785/0001-21";
	private static final List<Cliente> clientes = new ArrayList<>();
	private static final List<Entregador> entregadores = new ArrayList<>();

	private Dados() {

	}

	public static String getCnpj() {
		return cnpj;
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static List<Entregador> getEntregadores() {
		return entregadores;
	}
}
