package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Molho;
import view.CadastraMolho;
import view.MolhoTela;

/**
 * Controlador da tela de cadastro de molho, onde ser� realizado o cadastro de
 * um molho.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class CadastraMolhoController {

	private final CadastraMolho view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe CadastraMolhoController
	 * 
	 * @param view
	 */

	public CadastraMolhoController(CadastraMolho view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	/**
	 * M�todo que salvara o novo objeto molho com os dados inseridos pelo usu�rio se
	 * o bot�o pressionado for o de salvar, mas tamb�m poder� voltar para a tela de
	 * alimetos se for selecionado a op��o de cancelar. Neste m�todo tamb�m �
	 * incluido as mensagens de erro ou sucesso de cadastro do objeto de acordo com
	 * o retorno da fun��o "Valida dados".
	 * 
	 * @param e
	 */

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
				mensagem.mensagemSucessoCadastro();
				view.getPedido().getItens().add(model);

				new MolhoTela(view.getPedido()).setVisible(true);
				this.view.dispose();
			}

		}

	}

	/**
	 * M�todo para a valida��o dos dados inseridos pelo usu�rio, retornar� null se a
	 * valida��o falhar
	 * 
	 * @return Molho - molho que passou pela valida��o de dados.
	 */

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