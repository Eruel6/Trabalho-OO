package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.BatataFrita;
import view.CadastraBatataFrita;

public class BatataFritaController {

	private final BatataFrita view;

	public BatataFritaController(BatataFrita view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoBatataFrita(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarBatataFrita()) {

			new CadastraBatataFrita();

		}

		if (botaoPressionado == view.getBotaoEditarBatataFrita()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirBatataFrita()) {

			// new Molho();

		}
	}
}
