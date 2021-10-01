package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import view.Alimento;
import view.CadastraFrango;
import view.Frango;

public class FrangoController {

	private final Frango view;

	public FrangoController(Frango view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaFrango() {

		DefaultListModel<String> model;
		model = new DefaultListModel<String>();

		for (int i = 0; i < 3; i++) {
			model.addElement("Frango Empanado" + i);
		}

		return model;
	}

	public void pressionarBotaoFrango(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarFrango()) {

			new CadastraFrango().setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarFrango()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirFrango()) {

			// new Molho();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento().setVisible(true);
			this.view.dispose();

		}
	}

//	public InserirEditarFrango() {

}