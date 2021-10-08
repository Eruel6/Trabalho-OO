package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.FrangoEmpanado;
import view.EditaFrango;
import view.Frango;

/**
 * Controlador da tela de edição de um frango, onde será realizado a edição dos
 * dados previamente cadastrados ao objeto frnago.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class EditaFrangoController {

	private final EditaFrango view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe EditaFrangoController
	 * 
	 * @param view
	 */

	public EditaFrangoController(EditaFrango view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	/**
	 * Método para que salvara o objeto frango após a edição com os novos dados
	 * inseridos pelo usuário se o botão pressionado for o de salvar, mas também
	 * poderá voltar para a tela de frango se for selecionado a opção de cancelar.
	 * Neste método também é incluido as mensagens de erro ou sucesso de cadastro do
	 * objeto de acordo com o retorno da função "Valida dados".
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

				mensagem.mensagemErroEdicao();

			} else {
				FrangoEmpanado frangoParaEditar = this.view.getFrango();
				frangoParaEditar.setCorteDoFrango(model.getCorteDoFrango());
				frangoParaEditar.setDescricao(model.getDescricao());
				frangoParaEditar.setPreco(model.getPreco());
				frangoParaEditar.setTamanho(model.getTamanho());

				mensagem.mensagemSucessoEdicao();

				new Frango(view.getPedido()).setVisible(true);
				this.view.dispose();
			}

		}

	}

	/**
	 * Método para a validação dos dados inseridos pelo usuário, retornará null se a
	 * validação falhar
	 * 
	 * @return FrangoEmpanado - frango que passou pela validação de dados.
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