package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Molho;
import view.CadastraMolho;
import view.MolhoTela;

public class CadastraMolhoController {

	private final CadastraMolho view;

	public CadastraMolhoController(CadastraMolho view) {

		super();
		this.view = view;

	}

	public void pressionarBotaoMolho(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new MolhoTela().setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarMolho()) {

			Molho model = validaDados();

			if (model == null) {

				System.out.println("Algo deu errado");

			} else {
				System.out.println(model);

				new MolhoTela().setVisible(true);
				this.view.dispose();
			}

		}

	}

	private Molho validaDados() {

		String tamanho = this.view.getTamanhoMolho().getText();
		String preco = this.view.getPrecoMolho().getText();
		String descricao = this.view.getDescricaoMolho().getText();
		String tipo = this.view.getTipoMolho().getText();

		double precoValidado;

		if (!(tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G"))) {

			return null;

		}
		if ((descricao.isBlank())) {

			return null;

		}
		if (tipo.isBlank()) {
			return null;
		}
		try {
			precoValidado = Double.parseDouble(preco);
		} catch (NumberFormatException e) {
			return null;
		}

		return new Molho(tamanho.charAt(0), descricao, precoValidado, tipo);

	}
}
