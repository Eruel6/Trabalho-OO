package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.BatataFrita;
import model.Comida;
import view.Alimento;
import view.BatataFritaTela;
import view.CadastraBatataFrita;

public class BatataFritaController {

	private final BatataFritaTela view;

	public BatataFritaController(BatataFritaTela view) {

		super();
		this.view = view;

	}

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

	public void pressionarBotaoBatataFrita(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarBatataFrita()) {

			new CadastraBatataFrita(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarBatataFrita()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirBatataFrita()) {

			// new Molho();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento(view.getPedido()).setVisible(true);
			this.view.dispose();
			// new Molho();

		}

		if (botaoPressionado == view.getBotaoAdicionarBatata()) {

			// new Molho();

		}
	}
}