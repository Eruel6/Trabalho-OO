package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.CadastraFrango;
import view.Frango;

public class FrangoController {

	private final Frango view;

	public FrangoController(Frango view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoFrango(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarFrango()) {

			new CadastraFrango();

		}

		if (botaoPressionado == view.getBotaoEditarFrango()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirFrango()) {

			// new Molho();

		}
	}

//	public InserirEditarFrango() {

}
