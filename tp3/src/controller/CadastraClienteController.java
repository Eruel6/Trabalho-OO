package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import database.Dados;
import model.Cliente;
import view.CadastraCliente;
import view.ClienteTela;

/**
 * Controlador da tela de cadastro de cliente, onde será realizado o cadastro de
 * um cliente.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class CadastraClienteController {

	private final CadastraCliente view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe CadastraClienteControtoller
	 * 
	 * @param view
	 */

	public CadastraClienteController(CadastraCliente view) {

		super();
		this.view = view;
		this.mensagem = new Mensagens();

	}

	/**
	 * Método que salvara o novo objeto cliente com os dados inseridos pelo usuário
	 * se o botão pressionado for o de salvar, mas também poderá voltar para a tela
	 * de menu se for selecionado a opção de cancelar. Neste método também é
	 * incluido as mensagens de erro ou sucesso de cadastro do objeto de acordo com
	 * o retorno da função "Valida dados".
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

	/**
	 * Método para a validação dos dados inseridos pelo usuário, retornará null se a
	 * validação falhar
	 * 
	 * @return Cliente - cliente que passou pela validação de dados.
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