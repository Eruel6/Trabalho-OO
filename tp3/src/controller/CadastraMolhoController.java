package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Molho;
import view.CadastraMolho;
import view.MolhoTela;

/**
 * Controlador da tela de cadastro de molho, onde será realizado o cadastro de
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
	 * Método que salvara o novo objeto molho com os dados inseridos pelo usuário se
	 * o botão pressionado for o de salvar, mas também poderá voltar para a tela de
	 * alimetos se for selecionado a opção de cancelar. Neste método também é
	 * incluido as mensagens de erro ou sucesso de cadastro do objeto de acordo com
	 * o retorno da função "Valida dados".
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
	 * Método para a validação dos dados inseridos pelo usuário, retornará null se a
	 * validação falhar
	 * 
	 * @return Molho - molho que passou pela validação de dados.
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