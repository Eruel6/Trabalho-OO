package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.BatataFrita;
import view.BatataFritaTela;
import view.CadastraBatataFrita;

/**
 * Controlador da tela de cadastro da batata frita, onde será realizado o
 * cadastro de uma batata frita.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class CadastraBatataFritaController {

	private final CadastraBatataFrita view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe CadastraBatataFritaController
	 * 
	 * @param view
	 */

	public CadastraBatataFritaController(CadastraBatataFrita view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	/**
	 * Método que salvara o novo objeto batata frita com os dados inseridos pelo
	 * usuário se o botão pressionado for o de salvar, mas também poderá voltar para
	 * a tela de alimentos se for selecionado a opção de cancelar. Neste método
	 * também é incluido as mensagens de erro ou sucesso de cadastro do objeto de
	 * acordo com o retorno da função "Valida dados".
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

				mensagem.mensagemErroCadastro();

			} else {

				mensagem.mensagemSucessoCadastro();
				view.getPedido().getItens().add(model);

				new BatataFritaTela(view.getPedido()).setVisible(true);
				this.view.dispose();
			}

		}

	}

	/**
	 * Método para a validação dos dados inseridos pelo usuário, retornará null se a
	 * validação falhar
	 * 
	 * @return BatataFrita - batata frita que passou pela validação de dados.
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