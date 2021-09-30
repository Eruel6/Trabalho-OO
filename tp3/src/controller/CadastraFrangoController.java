package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.FrangoEmpanado;
import view.CadastraFrango;
import view.Frango;

public class CadastraFrangoController {

	private final CadastraFrango view;
	private final Mensagens mensagem;

	public CadastraFrangoController(CadastraFrango view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	public void pressionarBotaoFrango(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new Frango().setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarFrango()) {

			FrangoEmpanado model = validaDados();

			if (model == null) {

				mensagem.mensagemErroCadastro();

			} else {

				mensagem.mensagemSucessoCadastro();
				System.out.println(model);

				new Frango().setVisible(true);
				this.view.dispose();
			}

		}

	}

	private FrangoEmpanado validaDados() {

		String tamanho = this.view.getTamanhoFrango().getText();
		String preco = this.view.getPrecoFrango().getText();
		String descricao = this.view.getDescricaoFrango().getText();
		String corteDoFrango = this.view.getCorteDoFrango().getText();

		double precoValidado;

		if (!(tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G"))) {

			return null;

		}
		if ((descricao.isBlank())) {

			return null;

		}
		if (corteDoFrango.isBlank()) {
			return null;
		}
		try {
			precoValidado = Double.parseDouble(preco);
		} catch (NumberFormatException e) {
			return null;
		}

		return new FrangoEmpanado(tamanho.charAt(0), descricao, precoValidado, corteDoFrango);

	}
}
