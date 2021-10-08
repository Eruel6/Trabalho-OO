package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.ClienteTela;
import view.EntregadorTela;
import view.Menu;

/**
 * Controlador da tela de menu, in�cio do programa, onde sera possivel acessar
 * as telas de cliente e entregador para consulta ou devidos CRUDS e tamb�m ser�
 * poss�vel realizar a sa�da do programa.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class MenuController {

	private final Menu view;

	/**
	 * Construtor da classe MenuController
	 * 
	 * @param view
	 */

	public MenuController(Menu view) {

		super();
		this.view = view;

	}

	/**
	 * M�todo que define de acordo com o bot�o apertado qual tela ser� aberta em
	 * seguida para a vizualiza��o do usu�rio.
	 * 
	 * @param e
	 */

	public void pressionarBotao(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCliente()) {

			new ClienteTela();
			this.view.dispose();

		}
		if (botaoPressionado == view.getBotaoEntregador()) {

			new EntregadorTela();
			this.view.dispose();

		}
	}

}
