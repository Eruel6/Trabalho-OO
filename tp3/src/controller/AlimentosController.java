package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.Alimento;

public class AlimentosController {

	private final Alimento view;

	public AlimentosController(Alimento view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoAlimento(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoFrango()) {

			// new Pedidos();

		}

		if (botaoPressionado == view.getBotaoBatataFrita()) {

			// new Alimento();

		}

		if (botaoPressionado == view.getBotaoMolho()) {

			// new Cliente();
			System.out.println("FUNÇÂO NAO IMPLEMENTADA");
		}
	}
}
