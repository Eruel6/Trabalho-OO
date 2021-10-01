package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import database.Dados;
import view.CadastraCliente;
import view.ClienteTela;
import view.Menu;

public class ClienteController {

	private final ClienteTela view;

	public ClienteController(ClienteTela view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaCliente() {

		DefaultListModel<String> model;
		model = new DefaultListModel<String>();

		for (int i = 0; i < Dados.getClientes().size(); i++) {
			model.addElement(Dados.getClientes().get(i).getNome());
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

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirCliente()) {

			// remove(pressionarBotaoListaCliente(e));

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