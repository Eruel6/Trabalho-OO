package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.Alimento;
import view.BatataFritaTela;
import view.Frango;
import view.Menu;
import view.MolhoTela;

/**
 * Controlador da tela de alimentos, onde ser� realizado a��es de acordo com o
 * bot�o pressionado pelo usu�rio na tela alimento.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class AlimentosController {

	private final Alimento view;

	/**
	 * Construtor da classe alimentos controller.
	 * 
	 * @param view
	 */

	public AlimentosController(Alimento view) {

		super();
		this.view = view;

	}

	/**
	 * M�todo que define o que ir� acontecer de acordo com o bot�o que foi apertado
	 * na tela de alimento, levando para a tela onde � possivel realizar o CRUD do
	 * alimento selecionado
	 * 
	 * @param e
	 */

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