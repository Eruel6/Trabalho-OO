package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Cliente;
import view.ClienteTela;
import view.EditaCliente;

public class EditaClienteController {

	private final EditaCliente view;
	private final Mensagens mensagem;

	public EditaClienteController(EditaCliente view) {

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

				mensagem.mensagemErroEdicao();

			} else {
				Cliente clienteParaEditar = this.view.getCliente();
				clienteParaEditar.setTelefone(model.getTelefone());
				clienteParaEditar.setNome(model.getNome());
				clienteParaEditar.setCpf(model.getCpf());
				clienteParaEditar.setEndereco(model.getEndereco());

				mensagem.mensagemSucessoEdicao();

				new ClienteTela().setVisible(true);
				this.view.dispose();

			}

		}

	}

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