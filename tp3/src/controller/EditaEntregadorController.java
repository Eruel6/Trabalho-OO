package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.ContaBancaria;
import model.Entregador;
import view.EditaEntregador;
import view.EntregadorTela;

/**
 * Controlador da tela de edi��o de umentregador, onde ser� realizado a edi��o
 * dos dados previamente cadastrados ao objeto entregador.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class EditaEntregadorController {

	private final EditaEntregador view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe EditaEntregadorController
	 * 
	 * @param view
	 */

	public EditaEntregadorController(EditaEntregador view) {

		super();
		this.view = view;
		this.mensagem = new Mensagens();

	}

	/**
	 * M�todo para que salvara o objeto entregador ap�s a edi��o com os novos dados
	 * inseridos pelo usu�rio se o bot�o pressionado for o de salvar, mas tamb�m
	 * poder� voltar para a tela de entregador se for selecionado a op��o de
	 * cancelar. Neste m�todo tamb�m � incluido as mensagens de erro ou sucesso de
	 * cadastro do objeto de acordo com o retorno da fun��o "Valida dados".
	 * 
	 * @param e
	 */

	public void pressionarBotaoEntregador(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new EntregadorTela().setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarEntregador()) {

			Entregador model = validaDados();

			if (model == null) {

				mensagem.mensagemErroEdicao();

			} else {
				Entregador entregadorParaEditar = this.view.getEntregador();
				entregadorParaEditar.setModalidade(model.getModalidade());
				entregadorParaEditar.setNome(model.getNome());
				entregadorParaEditar.setCpf(model.getCpf());
				entregadorParaEditar.setEndereco(model.getEndereco());
				entregadorParaEditar.setNota(model.getNota());
				entregadorParaEditar.setConta(model.getConta());
				entregadorParaEditar.setEndereco(model.getEndereco());

				mensagem.mensagemSucessoEdicao();

				new EntregadorTela().setVisible(true);
				this.view.dispose();
			}

		}

	}

	/**
	 * M�todo para a valida��o dos dados inseridos pelo usu�rio, retornar� null se a
	 * valida��o falhar
	 * 
	 * @return Entregador - entregador que passou pela valida��o de dados.
	 */

	private Entregador validaDados() {

		ContaBancaria contaEntregador;

		String nome = this.view.getNomeEntregador().getText();
		String endereco = this.view.getEnderecoEntregador().getText();
		String cpf = this.view.getCpfEntregador().getText();
		String modalidade = this.view.getModalidadeEntregador().getText();
		String nota = this.view.getNotaEntregador().getText();
		String banco = this.view.getBancoContaEntregador().getText();
		String agencia = this.view.getAgenciaContaEntregador().getText();
		String conta = this.view.getNumeroContaEntregador().getText();

		double notaValidada;
		int agenciaValidada;

		if ((nome.isBlank()) || (endereco.isBlank())) {

			return null;

		}
		if (cpf.isBlank() || cpf.length() > 15 || cpf.length() < 10) {
			return null;
		}
		if (modalidade.isBlank()) {
			return null;
		}
		try {
			notaValidada = Double.parseDouble(nota);
		} catch (NumberFormatException e) {
			return null;
		}
		if (notaValidada < 0 || notaValidada > 5) {

			return null;
		}
		if ((banco.isBlank())) {

			return null;

		}

		try {
			agenciaValidada = Integer.parseInt(agencia);
		} catch (NumberFormatException e) {
			return null;
		}
		if (agencia.length() != 4) {

			return null;
		}

		if ((conta.isBlank() || conta.length() != 10)) {

			return null;

		}

		contaEntregador = new ContaBancaria(banco, agenciaValidada, conta);
		return new Entregador(nome, endereco, cpf, modalidade, notaValidada, contaEntregador);

	}
}