package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.CadastraMolho;
import view.MolhoTela;

public class MolhoController {

	private final MolhoTela view;

	public MolhoController(MolhoTela view) {

		super();
		this.view = view;

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
	}
}
