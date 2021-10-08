package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.BatataFrita;
import view.BatataFritaTela;
import view.EditaBatataFrita;

/**
 * Controlador da tela de edi��o de uma batata frita, onde ser� realizado a
 * edi��o dos dados previamente cadastrados ao objeto batata frita.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class EditaBatataFritaController {

	private final EditaBatataFrita view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe EditaBatataFrita.
	 * 
	 * @param view
	 */

	public EditaBatataFritaController(EditaBatataFrita view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	/**
	 * M�todo para que salvara o objeto batata frita ap�s a edi��o com os novos
	 * dados inseridos pelo usu�rio se o bot�o pressionado for o de salvar, mas
	 * tamb�m poder� voltar para a tela de batata frita se for selecionado a op��o
	 * de cancelar. Neste m�todo tamb�m � incluido as mensagens de erro ou sucesso
	 * de cadastro do objeto de acordo com o retorno da fun��o "Valida dados".
	 * 
	 * @param e
	 */

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

	/**
	 * M�todo para a valida��o dos dados inseridos pelo usu�rio, retornar� null se a
	 * valida��o falhar
	 * 
	 * @return BatataFrita - batata frita que passou pela valida��o de dados.
	 */

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