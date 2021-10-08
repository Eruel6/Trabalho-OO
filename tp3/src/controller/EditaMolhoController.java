package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Molho;
import view.EditaMolho;
import view.MolhoTela;

public class EditaMolhoController {

	private final EditaMolho view;
	private final Mensagens mensagem;

	public EditaMolhoController(EditaMolho view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	public void pressionarBotaoMolho(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new MolhoTela(view.getPedido()).setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarMolho()) {

			Molho model = validaDados();

			if (model == null) {

				mensagem.mensagemErroCadastro();

			} else {
				Molho molhoParaEditar = this.view.getMolho();
				molhoParaEditar.setTipo(model.getTipo());
				molhoParaEditar.setDescricao(model.getDescricao());
				molhoParaEditar.setPreco(model.getPreco());
				molhoParaEditar.setTamanho(model.getTamanho());

				mensagem.mensagemSucessoCadastro();

				new MolhoTela(view.getPedido()).setVisible(true);
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

		if (!(tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) || (descricao.isBlank())
				|| tipo.isBlank()) {
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