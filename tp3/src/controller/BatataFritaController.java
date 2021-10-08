package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.BatataFrita;
import model.Comida;
import view.Alimento;
import view.BatataFritaTela;
import view.CadastraBatataFrita;
import view.EditaBatataFrita;

/**
 * Controlador da tela da batata frita, onde será realizado o CRUD de batata
 * frita.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class BatataFritaController {

	private final BatataFritaTela view;

	/**
	 * Construtor da classe batata frita controller.
	 * 
	 * @param view
	 */

	public BatataFritaController(BatataFritaTela view) {

		super();
		this.view = view;

	}

	/**
	 * Método para geração da lista de batata fritas cadastradas, possibilitando a
	 * seleção para edição ou exclusão de uma batata frita
	 * 
	 */

	public DefaultListModel<String> gerarListaBatataFrita() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Comida comida : view.getPedido().getItens()) {

			if (comida instanceof BatataFrita) {

				BatataFrita batataFrita = (BatataFrita) comida;
				model.addElement(batataFrita.getAcompanhamento());

			}

		}

		return model;
	}

	/**
	 * Método de controle da tela de batata frita onde o usuário terá a opção de
	 * realizar o CRUD de uma batata frita, sendo que as opções de editar e excluir
	 * funcionam apenas com pelo menos um objeto cadastrado.
	 * 
	 * @param e
	 */

	public void pressionarBotaoBatataFrita(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarBatataFrita()) {

			new CadastraBatataFrita(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarBatataFrita()) {

			int selectedIndex = view.getListaBatatas().getSelectedIndex();
			BatataFrita batataSelecionada = (BatataFrita) view.getPedido().getItens().get(selectedIndex);
			new EditaBatataFrita(batataSelecionada, view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoExcluirBatataFrita()) {

			int selectedIndex = view.getListaBatatas().getSelectedIndex();
			view.getPedido().getItens().remove(selectedIndex);
			new BatataFritaTela(view.getPedido()).setVisible(true);
			this.view.dispose();
		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

	}
}