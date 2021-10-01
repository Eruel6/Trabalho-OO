package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import database.Dados;
import model.Entregador;
import view.CadastraEntregador;
import view.EntregadorTela;
import view.Menu;

public class EntregadorController {

	private final EntregadorTela view;

	public EntregadorController(EntregadorTela view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaEntregadores() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Entregador element : Dados.getEntregadores()) {
			model.addElement(element.getNome());
		}

		return model;
	}

	public void pressionarBotaoEntregador(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarEntragador()) {

			new CadastraEntregador();
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarEntregador()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirEntregador()) {

			// new Molho();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Menu().setVisible(true);
			this.view.dispose();
			// new Molho();

		}
	}
}