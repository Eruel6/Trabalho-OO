package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.BatataFrita;
import view.BatataFritaTela;
import view.CadastraBatataFrita;

public class CadastraBatataFritaController {

	private final CadastraBatataFrita view;
	private final Mensagens mensagem;

	public CadastraBatataFritaController(CadastraBatataFrita view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	public void pressionarBotaoBatataFrita(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new BatataFritaTela(view.getPedido()).setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarBatataFrita()) {

			BatataFrita model = validaDados();

			if (model == null) {

				mensagem.mensagemErroCadastro();

			} else {

				mensagem.mensagemSucessoCadastro();
				view.getPedido().getItens().add(model);

				new BatataFritaTela(view.getPedido()).setVisible(true);
				this.view.dispose();
			}

		}

	}

	private BatataFrita validaDados() {

		String tamanho = this.view.getTamanhoBatataFrita().getText();
		String preco = this.view.getPrecoBatataFrita().getText();
		String descricao = this.view.getDescricaoBatataFrita().getText();
		String acompanhamento = this.view.getAcompanhamentoBatataFrita().getText();

		double precoValidado;

		if (!(tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) || (descricao.isBlank()) || acompanhamento.isBlank()) {
			return null;
		}
		try {
			precoValidado = Double.parseDouble(preco);
		} catch (NumberFormatException e) {
			return null;
		}

		return new BatataFrita(tamanho.charAt(0), descricao, precoValidado, acompanhamento);

	}
}