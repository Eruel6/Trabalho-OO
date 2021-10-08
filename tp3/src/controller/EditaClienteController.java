package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Cliente;
import view.ClienteTela;
import view.EditaCliente;

/**
 * Controlador da tela de edi��o de um cliente, onde ser� realizado a edi��o dos
 * dados previamente cadastrados ao objeto cliente.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class EditaClienteController {

	private final EditaCliente view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe EditaClienteController
	 * 
	 * @param view
	 */

	public EditaClienteController(EditaCliente view) {

		super();
		this.view = view;
		this.mensagem = new Mensagens();

	}

	/**
	 * M�todo para que salvara o objeto cliente ap�s a edi��o com os novos dados
	 * inseridos pelo usu�rio se o bot�o pressionado for o de salvar, mas tamb�m
	 * poder� voltar para a tela de cliente se for selecionado a op��o de cancelar.
	 * Neste m�todo tamb�m � incluido as mensagens de erro ou sucesso de cadastro do
	 * objeto de acordo com o retorno da fun��o "Valida dados".
	 * 
	 * @param e
	 */

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

	/**
	 * M�todo para a valida��o dos dados inseridos pelo usu�rio, retornar� null se a
	 * valida��o falhar
	 * 
	 * @return Cliente - cliente que passou pela valida��o de dados.
	 */

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