package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Molho;
import view.EditaMolho;
import view.MolhoTela;

/**
 * Controlador da tela de edição de um molho, onde será realizado a edição dos
 * dados previamente cadastrados ao objeto molho.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class EditaMolhoController {

	private final EditaMolho view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe EditaMolhoController
	 * 
	 * @param view
	 */

	public EditaMolhoController(EditaMolho view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	/**
	 * Método para que salvara o objeto molho após a edição com os novos dados
	 * inseridos pelo usuário se o botão pressionado for o de salvar, mas também
	 * poderá voltar para a tela de molho se for selecionado a opção de cancelar.
	 * Neste método também é incluido as mensagens de erro ou sucesso de cadastro do
	 * objeto de acordo com o retorno da função "Valida dados".
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

	/**
	 * Método para a validação dos dados inseridos pelo usuário, retornará null se a
	 * validação falhar
	 * 
	 * @return Molho - frango que passou pela validação de dados.
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