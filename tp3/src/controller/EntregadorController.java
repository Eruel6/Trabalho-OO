package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.CadastraEntregador;
import view.Entregador;

public class EntregadorController {

	private final Entregador view;

	public EntregadorController(Entregador view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoEntregador(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarEntragador()) {

			new CadastraEntregador();

		}

		if (botaoPressionado == view.getBotaoEditarEntregador()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirEntregador()) {

			// new Molho();

		}
	}
}