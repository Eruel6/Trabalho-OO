package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.Pedido;
import view.Alimento;
import view.CadastraPedido;
import view.ClienteTela;
import view.Pedidos;

/**
 * Controlador da tela de pedidos, onde ser� realizado o CRUD de pedido.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class PedidosController {

	private final Pedidos view;

	/**
	 * Construtor da classe PedidosController.
	 * 
	 * @param view
	 */

	public PedidosController(Pedidos view) {

		super();
		this.view = view;

	}

	/**
	 * M�todo para gera��o da lista de pedidos cadastrados possibilitando a sele��o
	 * para a edi��o ou exclus�o de um pedidos.
	 */

	public DefaultListModel<String> gerarListaPedidos() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();
		var listaPedidos = view.getCliente().getPedidos();

		for (Pedido pedido : listaPedidos) {

			model.addElement("Pedido" + pedido.getNumero());
		}

		return model;
	}

	/**
	 * M�todo de controle da tela de pedido onde o usu�rio ter� a op��o de realizar
	 * o CRUD de uma pedido, sendo que as op��es de editar e excluir funcionam
	 * apenas com pelo menos um objeto cadastrado.
	 * 
	 * @param e
	 */

	public void pressionarBotaoPedido(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarPedido()) {

			int selectedIndex = view.getListaPedidos().getSelectedIndex();
			Pedido pedidoSelecionado = view.getCliente().getPedidos().get(selectedIndex);
			new Alimento(pedidoSelecionado).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoCriarPedido()) {

			new CadastraPedido(view.getCliente()).setVisible(true);
			this.view.dispose();
		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new ClienteTela().setVisible(true);
			this.view.dispose();

		}
	}
}
