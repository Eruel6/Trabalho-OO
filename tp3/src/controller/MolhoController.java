package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.Comida;
import model.Molho;
import view.Alimento;
import view.CadastraMolho;
import view.MolhoTela;

public class MolhoController {

	private final MolhoTela view;

	public MolhoController(MolhoTela view) {

		super();
		this.view = view;

	}

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

	public void pressionarBotaoMolho(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarMolho()) {

			new CadastraMolho(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarMolho()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirMolho()) {

			// new Molho();

		}
		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento(view.getPedido()).setVisible(true);
			this.view.dispose();

			// new Molho();

		}

		if (botaoPressionado == view.getBotaoAdicionarMolho()) {

			// new Molho();

		}
	}
}