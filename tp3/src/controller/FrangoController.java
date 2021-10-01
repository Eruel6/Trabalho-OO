package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.Comida;
import model.FrangoEmpanado;
import view.Alimento;
import view.CadastraFrango;
import view.Frango;

public class FrangoController {

	private final Frango view;

	public FrangoController(Frango view) {

		super();
		this.view = view;

	}

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

	public void pressionarBotaoFrango(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarFrango()) {

			new CadastraFrango(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoEditarFrango()) {

			// new BatataFrita();

		}

		if (botaoPressionado == view.getBotaoExcluirFrango()) {

			// new Molho();

		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new Alimento(view.getPedido()).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoAdicionarFrango()) {

		}
	}

//	public InserirEditarFrango() {

}