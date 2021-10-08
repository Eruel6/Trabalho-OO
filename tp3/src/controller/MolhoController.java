package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.Comida;
import model.Molho;
import view.Alimento;
import view.CadastraMolho;
import view.EditaMolho;
import view.MolhoTela;

/**
 * Controlador da tela de molho, onde ser� realizado o CRUD de molho.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class MolhoController {

	private final MolhoTela view;

	/**
	 * Construtor da classe MolhoController.
	 * 
	 * @param view
	 */

	public MolhoController(MolhoTela view) {

		super();
		this.view = view;

	}

	/**
	 * M�todo para gera��o da lista de molhos cadastrados possibilitando a sele��o
	 * para a edi��o ou exclus�o de um molho.
	 */

	public DefaultListModel<String> gerarListaMolho() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Comida comida : view.getPedido().getItens()) {

			if (comida instanceof Molho) {

				Molho molho = (Molho) comida;
				model.addElement(molho.getTipo());

			}

		}

		return model;
	}

	/**
	 * M�todo de controle da tela de molho onde o usu�rio ter� a op��o de realizar o
	 * CRUD de um molho, sendo que as op��es de editar e excluir funcionam apenas
	 * com pelo menos um objeto cadastrado.
	 * 
	 * @param e
	 */

	public void pressionarBotaoMolho(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarMolho()) {

			new CadastraMolho(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarMolho()) {

			int selectedIndex = view.getListaMolhos().getSelectedIndex();
			Molho molhoSelecionado = (Molho) view.getPedido().getItens().get(selectedIndex);
			new EditaMolho(molhoSelecionado, view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoExcluirMolho()) {

			int selectedIndex = view.getListaMolhos().getSelectedIndex();
			view.getPedido().getItens().remove(selectedIndex);
			new MolhoTela(view.getPedido()).setVisible(true);
			this.view.dispose();
		}
		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

	}
}