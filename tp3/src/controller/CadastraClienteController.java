package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import database.Dados;
import model.Cliente;
import view.CadastraCliente;
import view.ClienteTela;

public class CadastraClienteController {

	private final CadastraCliente view;
	private final Mensagens mensagem;

	public CadastraClienteController(CadastraCliente view) {

		super();
		this.view = view;
		this.mensagem = new Mensagens();

	}

	public void pressionarBotaoCliente(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new ClienteTela().setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarCliente()) {

			Cliente model = validaDados();

			if (model == null) {

				mensagem.mensagemErroCadastro();

			} else {
				System.out.println(model);
				Dados.getClientes().add(model);
				mensagem.mensagemSucessoCadastro();

				new ClienteTela().setVisible(true);
				this.view.dispose();

			}

		}

	}

//	public void editarCliente(ActionEvent e) {
//
//		JButton botaoPressionado = (JButton) e.getSource();
//
//		if (botaoPressionado == this.view.getBotaoCancelar()) {
//
//			new ClienteTela().setVisible(true);
//			this.view.dispose();
//
//		} else if (botaoPressionado == this.view.getBotaoSalvarCliente()) {
//
//			Cliente model = validaDados();
//
//			if (model == null) {
//
//				mensagem.mensagemErroCadastro();
//
//			} else {
//				System.out.println(model);
//				Dados.getClientes().add(model);
//				mensagem.mensagemSucessoCadastro();
//
//
//				new ClienteTela().setVisible(true);
//				this.view.dispose();
//
//			}
//
//		}
//
//	}

	private Cliente validaDados() {

		String nome = this.view.getNomeCliente().getText();
		String endereco = this.view.getEnderecoCliente().getText();
		String cpf = this.view.getCpfCliente().getText();
		String telefone = this.view.getTelefoneCliente().getText();

		if ((nome.isBlank()) || (endereco.isBlank())) {

			return null;

		}
		if (cpf.isBlank() || cpf.length() > 15 || cpf.length() < 10) {
			return null;
		}
		if (telefone.isBlank() || telefone.length() < 10 && telefone.length() > 16) {
			return null;
		}

		return new Cliente(nome, endereco, cpf, telefone);

	}
}