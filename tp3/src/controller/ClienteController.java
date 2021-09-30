package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.CadastraCliente;
import view.ClienteTela;

public class ClienteController {

	private final ClienteTela view;

	public ClienteController(ClienteTela view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoCliente(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarCliente()) {

			new CadastraCliente();

		}

		if (botaoPressionado == view.getBotaoEditarCliente()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirCliente()) {

			// new Molho();

		}
	}
}
