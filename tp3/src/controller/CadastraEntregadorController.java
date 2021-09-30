package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.ContaBancaria;
import model.Entregador;
import view.CadastraEntregador;
import view.EntregadorTela;

public class CadastraEntregadorController {

	private final CadastraEntregador view;
	private final Mensagens mensagem;

	public CadastraEntregadorController(CadastraEntregador view) {

		super();
		this.view = view;
		this.mensagem = new Mensagens();

	}

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
				System.out.println(model);
				mensagem.mensagemSucessoCadastro();

				new EntregadorTela().setVisible(true);
				this.view.dispose();
			}

		}

	}

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

		if ((nome.isBlank())) {

			return null;

		}
		if ((endereco.isBlank())) {

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
