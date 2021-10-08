package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.BatataFrita;
import view.BatataFritaTela;
import view.EditaBatataFrita;

public class EditaBatataFritaController {

	private final EditaBatataFrita view;
	private final Mensagens mensagem;

	public EditaBatataFritaController(EditaBatataFrita view) {

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

				mensagem.mensagemErroEdicao();

			} else {
				BatataFrita batataParaEditar = this.view.getBatataFrita();
				batataParaEditar.setAcompanhamento(model.getAcompanhamento());
				batataParaEditar.setDescricao(model.getDescricao());
				batataParaEditar.setPreco(model.getPreco());
				batataParaEditar.setTamanho(model.getTamanho());

				mensagem.mensagemSucessoEdicao();

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

		if (!(tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) || (descricao.isBlank())
				|| acompanhamento.isBlank()) {
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