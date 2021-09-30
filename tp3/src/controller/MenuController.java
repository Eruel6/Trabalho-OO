package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.Alimento;
import view.ClienteTela;
import view.EntregadorTela;
import view.Menu;
import view.Pedidos;

public class MenuController {

	private final Menu view;

	public MenuController(Menu view) {

		super();
		this.view = view;

	}

	public void pressionarBotao(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoPedido()) {

			new Pedidos();

		}

		if (botaoPressionado == view.getBotaoAlimento()) {

			new Alimento();

		}

		if (botaoPressionado == view.getBotaoCliente()) {

			new ClienteTela();

		}
		if (botaoPressionado == view.getBotaoEntregador()) {

			new EntregadorTela();

		}
	}

}
