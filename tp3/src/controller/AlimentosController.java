package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.Alimento;
import view.BatataFritaTela;
import view.Frango;
import view.Menu;
import view.MolhoTela;

/**
 * Controlador da tela de alimentos, onde será realizado ações de acordo com o
 * botão pressionado pelo usuário na tela alimento.
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
	 * Método que define o que irá acontecer de acordo com o botão que foi apertado
	 * na tela de alimento, levando para a tela onde é possivel realizar o CRUD do
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