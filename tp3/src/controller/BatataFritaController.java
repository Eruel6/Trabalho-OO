package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.BatataFritaTela;
import view.CadastraBatataFrita;

public class BatataFritaController {

	private final BatataFritaTela view;

	public BatataFritaController(BatataFritaTela view) {

		super();
		this.view = view;

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
	}
}
