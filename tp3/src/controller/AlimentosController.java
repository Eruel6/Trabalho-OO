package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.Alimento;
import view.BatataFritaTela;
import view.Frango;
import view.Menu;
import view.MolhoTela;

public class AlimentosController {

	private final Alimento view;

	public AlimentosController(Alimento view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoAlimento(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoFrango()) {

			new Frango(view.getPedido());
			this.view.dispose();
		}

		if (botaoPressionado == view.getBotaoBatataFrita()) {

			new BatataFritaTela(view.getPedido());
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoMolho()) {

			new MolhoTela(view.getPedido());
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Menu().setVisible(true);
			this.view.dispose();
		}
	}
}