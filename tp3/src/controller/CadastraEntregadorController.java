package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import database.Dados;
import model.ContaBancaria;
import model.Entregador;
import view.CadastraEntregador;
import view.EntregadorTela;

/**
 * Controlador da tela de cadastro de entregador, onde ser� realizado o cadastro
 * de um entregador.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class CadastraEntregadorController {

	private final CadastraEntregador view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe CadastraEntregadorController
	 * 
	 * @param view
	 */

	public CadastraEntregadorController(CadastraEntregador view) {

		super();
		this.view = view;
		this.mensagem = new Mensagens();

	}

	/**
	 * M�todo que salvara o novo objeto entregador com os dados inseridos pelo
	 * usu�rio se o bot�o pressionado for o de salvar, mas tamb�m poder� voltar para
	 * a tela de menu se for selecionado a op��o de cancelar. Neste m�todo tamb�m �
	 * incluido as mensagens de erro ou sucesso de cadastro do objeto de acordo com
	 * o retorno da fun��o "Valida dados".
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

				mensagem.mensagemErroCadastro();

			} else {
				Dados.getEntregadores().add(model);
				mensagem.mensagemSucessoCadastro();

				new EntregadorTela().setVisible(true);
				this.view.dispose();
			}

		}

	}

	/**
	 * M�todo para a valida��o dos dados inseridos pelo usu�rio, retornar� null se a
	 * valida��o falhar
	 * 
	 * @return Entregador - Entregador que passou pela valida��o de dados.
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