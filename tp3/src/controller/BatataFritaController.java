package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import view.Alimento;
import view.BatataFritaTela;
import view.CadastraBatataFrita;

public class BatataFritaController {

	private final BatataFritaTela view;

	public BatataFritaController(BatataFritaTela view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaBatataFrita() {

		DefaultListModel<String> model;
		model = new DefaultListModel<String>();

		for (int i = 0; i < 3; i++) {
			model.addElement("Batata Frita" + i);
		}

		return model;
	}

	public void pressionarBotaoBatataFrita(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarBatataFrita()) {

			new CadastraBatataFrita().setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarBatataFrita()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirBatataFrita()) {

			// new Molho();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento().setVisible(true);
			this.view.dispose();
			// new Molho();

		}
	}
}
