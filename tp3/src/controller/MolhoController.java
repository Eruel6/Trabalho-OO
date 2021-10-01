package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import view.Alimento;
import view.CadastraMolho;
import view.MolhoTela;

public class MolhoController {

	private final MolhoTela view;

	public MolhoController(MolhoTela view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaMolho() {

		DefaultListModel<String> model;
		model = new DefaultListModel<String>();

		for (int i = 0; i < 3; i++) {
			model.addElement("Molho" + i);
		}

		return model;
	}

	public void pressionarBotaoMolho(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarMolho()) {

			new CadastraMolho().setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarMolho()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirMolho()) {

			// new Molho();

		}
		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento().setVisible(true);
			this.view.dispose();

			// new Molho();

		}
	}
}
