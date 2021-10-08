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

public class EntregadorController {

	private final EntregadorTela view;

	public EntregadorController(EntregadorTela view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaEntregadores() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Entregador element : Dados.getEntregadores()) {
			model.addElement(element.getNome());
		}

		return model;
	}

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
			// new Molho();

		}
	}
}