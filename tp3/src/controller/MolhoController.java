package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.CadastraMolho;
import view.Molho;

public class MolhoController {

	private final Molho view;

	public MolhoController(Molho view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoMolho(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarMolho()) {

			new CadastraMolho();

		}

		if (botaoPressionado == view.getBotaoEditarMolho()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirMolho()) {

			// new Molho();

		}
	}
}
