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

/**
 * Controlador da tela cliente, onde será realizado o CRUD de cliente, além de
 * poder selecionar o cliente para que possa ser realizado o pedido.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class ClienteController {

	private final ClienteTela view;

	/**
	 * Construtor da classe ClienteController
	 * 
	 * @param view
	 */

	public ClienteController(ClienteTela view) {

		super();
		this.view = view;

	}

	/**
	 * Método para a impressão da lista de clientes, tornando possível a seleção dos
	 * clientes cadastrados que torna possível a atribuição de pedidos aos clientes,
	 * a edição e a exclusão de cliente.
	 * 
	 * @return model - cliente cadastrado
	 */

	public DefaultListModel<String> gerarListaCliente() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Cliente element : Dados.getClientes()) {
			model.addElement(element.getNome());
		}

		return model;
	}

	/**
	 * Método que define o que irá acontecer de acordo com o botão que foi apertado
	 * na tela de cliente, levando para as outras telas que possibilitarão o CRUD de
	 * um cliente, neste controller pode se consultar também os pedidos atribuidos a
	 * um cliente através do botão "pedido"
	 * 
	 * @param e
	 */

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

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Menu().setVisible(true);
			this.view.dispose();

		}

	}

}