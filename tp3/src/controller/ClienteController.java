package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.CadastraCliente;
import view.Cliente;

public class ClienteController {

	private final Cliente view;

	public ClienteController(Cliente view) {

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
