package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.FrangoEmpanado;
import view.CadastraFrango;
import view.Frango;

/**
 * Controlador da tela de cadastro de frango, onde ser� realizado o cadastro de
 * um frango.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class CadastraFrangoController {

	private final CadastraFrango view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe CadastraFrangoController
	 * 
	 * @param view
	 */

	public CadastraFrangoController(CadastraFrango view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	/**
	 * M�todo que salvara o novo objeto frango com os dados inseridos pelo usu�rio
	 * se o bot�o pressionado for o de salvar, mas tamb�m poder� voltar para a tela
	 * de alimetos se for selecionado a op��o de cancelar. Neste m�todo tamb�m �
	 * incluido as mensagens de erro ou sucesso de cadastro do objeto de acordo com
	 * o retorno da fun��o "Valida dados".
	 * 
	 * @param e
	 */

	public void pressionarBotaoFrango(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new Frango(view.getPedido()).setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarFrango()) {

			FrangoEmpanado model = validaDados();

			if (model == null) {

				mensagem.mensagemErroCadastro();

			} else {

				mensagem.mensagemSucessoCadastro();
				view.getPedido().getItens().add(model);

				new Frango(view.getPedido()).setVisible(true);
				this.view.dispose();
			}

		}

	}

	/**
	 * M�todo para a valida��o dos dados inseridos pelo usu�rio, retornar� null se a
	 * valida��o falhar
	 * 
	 * @return FrangoEmpanado - frango que passou pela valida��o de dados.
	 */

	private FrangoEmpanado validaDados() {

		String tamanho = this.view.getTamanhoFrango().getText();
		String preco = this.view.getPrecoFrango().getText();
		String descricao = this.view.getDescricaoFrango().getText();
		String corteDoFrango = this.view.getCorteDoFrango().getText();

		double precoValidado;

		if (!(tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) || (descricao.isBlank())
				|| corteDoFrango.isBlank()) {
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