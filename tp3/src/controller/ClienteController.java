package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import database.Dados;
import model.Cliente;
import view.CadastraCliente;
import view.ClienteTela;
import view.EditaCliente;
import view.Menu;
import view.Pedidos;

public class ClienteController {

	private final ClienteTela view;

	public ClienteController(ClienteTela view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaCliente() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Cliente element : Dados.getClientes()) {
			model.addElement(element.getNome());
		}

		return model;
	}

	public void pressionarBotaoCliente(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarCliente()) {

			new CadastraCliente();
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarCliente()) {

			int selectedIndex = view.getListaClientes().getSelectedIndex();
			Cliente clienteSelecionado = Dados.getClientes().get(selectedIndex);
			new EditaCliente(clienteSelecionado);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoExcluirCliente()) {

			int selectedIndex = view.getListaClientes().getSelectedIndex();
			Dados.getClientes().remove(selectedIndex);
			new ClienteTela().setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoPedido()) {

			int selectedIndex = view.getListaClientes().getSelectedIndex();
			Cliente clienteSelecionado = Dados.getClientes().get(selectedIndex);
			new Pedidos(clienteSelecionado).setVisible(true);
			this.view.dispose();
			// new Molho();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Menu().setVisible(true);
			this.view.dispose();
			// new Molho();

		}

	}

	/*
	 * public int pressionarBotaoListaCliente(ListSelectionEvent e) {
	 *
	 * int index = 0;
	 *
	 * JList<String> listaPressionada = (JList<String>) e.getSource(); JButton
	 * botaoPressionado = (JButton) e.getSource();
	 *
	 * if(listaPressionada == view.getListaClientes()) {
	 *
	 * index = view.getListaClientes().getSelectedIndex();
	 *
	 * if(botaoPressionado == view.getBotaoExcluirCliente()) {
	 *
	 * Delete(index); }
	 *
	 * view.getListaClientes().getSelectedValue();
	 *
	 * }
	 *
	 *
	 * return index;
	 *
	 * }
	 */

}