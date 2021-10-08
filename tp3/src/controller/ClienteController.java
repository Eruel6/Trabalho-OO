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
 * Controlador da tela cliente, onde ser� realizado o CRUD de cliente, al�m de
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
	 * M�todo para a impress�o da lista de clientes, tornando poss�vel a sele��o dos
	 * clientes cadastrados que torna poss�vel a atribui��o de pedidos aos clientes,
	 * a edi��o e a exclus�o de cliente.
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
	 * M�todo que define o que ir� acontecer de acordo com o bot�o que foi apertado
	 * na tela de cliente, levando para as outras telas que possibilitar�o o CRUD de
	 * um cliente, neste controller pode se consultar tamb�m os pedidos atribuidos a
	 * um cliente atrav�s do bot�o "pedido"
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