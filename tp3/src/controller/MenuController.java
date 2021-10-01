package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.ClienteTela;
import view.EntregadorTela;
import view.Menu;

public class MenuController {

	private final Menu view;

	public MenuController(Menu view) {

		super();
		this.view = view;

	}

	public void pressionarBotao(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		/*
		 * if (botaoPressionado == view.getBotaoPedido()) {
		 *
		 * new Pedidos(); this.view.dispose();
		 *
		 * }
		 *
		 * if (botaoPressionado == view.getBotaoAlimento()) {
		 *
		 * new Alimento(); this.view.dispose();
		 *
		 * }
		 */

		if (botaoPressionado == view.getBotaoCliente()) {

			new ClienteTela();
			this.view.dispose();

		}
		if (botaoPressionado == view.getBotaoEntregador()) {

			new EntregadorTela();
			this.view.dispose();

		}
	}

}
