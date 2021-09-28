package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.Alimento;
import view.BatataFrita;
import view.Frango;
import view.Molho;

public class AlimentosController {

	private final Alimento view;

	public AlimentosController(Alimento view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoAlimento(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoFrango()) {

			new Frango();

		}

		if (botaoPressionado == view.getBotaoBatataFrita()) {

			new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoMolho()) {

			new Molho();

		}
	}
}
