package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import database.Dados;
import model.Entregador;
import view.CadastraEntregador;
import view.EditaEntregador;
import view.EntregadorTela;
import view.Menu;

/**
 * Controlador da tela entregador, onde ser� realizado o CRUD de entregador.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class EntregadorController {

	private final EntregadorTela view;

	/**
	 * Construtor da tela EntregadorController
	 * 
	 * @param view
	 */

	public EntregadorController(EntregadorTela view) {

		super();
		this.view = view;

	}

	/**
	 * M�todo para a impress�o da lista de entregadores, tornando poss�vel a sele��o
	 * dos entregadores cadastrados para a realiza��o da edi��o e da exclus�o.
	 * 
	 * @return model - entregador cadastrado
	 */

	public DefaultListModel<String> gerarListaEntregadores() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Entregador element : Dados.getEntregadores()) {
			model.addElement(element.getNome());
		}

		return model;
	}

	/**
	 * M�todo que define o que ir� acontecer de acordo com o bot�o que foi apertado
	 * na tela de entregador, levando para as outras telas que possibilitar�o o CRUD
	 * de um entregador.
	 * 
	 * @param e
	 */

	public void pressionarBotaoEntregador(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarEntregador()) {

			new CadastraEntregador();
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarEntregador()) {

			int selectedIndex = view.getListaEntregadores().getSelectedIndex();
			Entregador entregadorSelecionado = Dados.getEntregadores().get(selectedIndex);
			new EditaEntregador(entregadorSelecionado);
			this.view.dispose();
		}

		if (botaoPressionado == view.getBotaoExcluirEntregador()) {

			int selectedIndex = view.getListaEntregadores().getSelectedIndex();
			Dados.getEntregadores().remove(selectedIndex);
			new EntregadorTela().setVisible(true);
			this.view.dispose();
		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Menu().setVisible(true);
			this.view.dispose();

		}
	}
}