package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.Comida;
import model.FrangoEmpanado;
import view.Alimento;
import view.CadastraFrango;
import view.EditaFrango;
import view.Frango;

/**
 * Controlador da tela do frango, onde será realizado o CRUD de frango.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class FrangoController {

	private final Frango view;

	/**
	 * Construtor da classe FrangoController
	 * 
	 * @param view
	 */

	public FrangoController(Frango view) {

		super();
		this.view = view;

	}

	/**
	 * Método para geração da lista de frangos cadastrados possibilitando a seleção
	 * para a edição ou exclusão de um frango.
	 */

	public DefaultListModel<String> gerarListaFrango() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();

		for (Comida comida : view.getPedido().getItens()) {

			if (comida instanceof FrangoEmpanado) {

				FrangoEmpanado frango = (FrangoEmpanado) comida;
				model.addElement(frango.getCorteDoFrango());

			}

		}

		return model;
	}

	/**
	 * Método de controle da tela de frango onde o usuário terá a opção de realizar
	 * o CRUD de um frango, sendo que as opções de editar e excluir funcionam apenas
	 * com pelo menos um objeto cadastrado.
	 * 
	 * @param e
	 */

	public void pressionarBotaoFrango(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarFrango()) {

			new CadastraFrango(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarFrango()) {

			int selectedIndex = view.getListaFrangos().getSelectedIndex();
			FrangoEmpanado frangoSelecionado = (FrangoEmpanado) view.getPedido().getItens().get(selectedIndex);
			new EditaFrango(frangoSelecionado, view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoExcluirFrango()) {

			int selectedIndex = view.getListaFrangos().getSelectedIndex();
			view.getPedido().getItens().remove(selectedIndex);
			new Frango(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

	}

}