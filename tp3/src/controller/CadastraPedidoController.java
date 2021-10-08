package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import database.Dados;
import model.Entregador;
import model.Pedido;
import view.CadastraPedido;
import view.Pedidos;

/**
 * Controlador da tela de cadastro de pedido, onde ser� realizado o cadastro de
 * um pedido.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class CadastraPedidoController {

	private final CadastraPedido view;
	private final Mensagens mensagem;

	/**
	 * Construtor da classe CadastraPedidoController
	 * 
	 * @param view
	 */

	public CadastraPedidoController(CadastraPedido view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	/**
	 * Este m�todo � respponsavel por atribuir um entregador ao pedido, foi feito na
	 * forma de comboBox para que fosse mais intuitivo para o usu�rio selecionar o
	 * entregador
	 * 
	 * @return model - entregador cadastrado
	 */

	public DefaultComboBoxModel<String> gerarListaEntregadores() {

		DefaultComboBoxModel<String> model;
		model = new DefaultComboBoxModel<>();

		for (Entregador element : Dados.getEntregadores()) {
			model.addElement(element.getNome());
		}

		return model;
	}

	/**
	 * M�todo que salvara o novo objeto pedido com os dados inseridos pelo usu�rio
	 * se o bot�o pressionado for o de salvar, mas tamb�m poder� voltar para a tela
	 * de pedidos se for selecionado a op��o de cancelar. Neste m�todo tamb�m �
	 * incluido as mensagens de erro ou sucesso de cadastro do objeto de acordo com
	 * o retorno da fun��o "Valida dados".
	 * 
	 * @param e
	 */

	public void pressionarBotaoPedido(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == this.view.getBotaoCancelar()) {

			new Pedidos(view.getCliente()).setVisible(true);
			this.view.dispose();

		} else if (botaoPressionado == this.view.getBotaoSalvarPedido()) {

			Pedido model = validaDados();

			if (model == null) {

				mensagem.mensagemErroCadastro();

			} else {
				mensagem.mensagemSucessoCadastro();
				view.getCliente().getPedidos().add(model);

				new Pedidos(view.getCliente()).setVisible(true);
				this.view.dispose();
			}

		}

	}

	/**
	 * M�todo para a valida��o dos dados inseridos pelo usu�rio, retornar� null se a
	 * valida��o falhar
	 * 
	 * @return Pedido - pedido que passou pela valida��o de dados.
	 */

	private Pedido validaDados() {

		String numero = this.view.getNumeroPedido().getText();
		String metodoPagamento = this.view.getMetodoPagamentoPedido().getText();
		Entregador entregador = Dados.getEntregadores().get(view.getListaEntregadores().getSelectedIndex());
		String retirada = this.view.getRetiradaPedido().getText();

		int numeroValidado;
		boolean retiradaValidada;

		try {
			numeroValidado = Integer.parseInt(numero);
		} catch (NumberFormatException e) {
			return null;
		}
		if ((metodoPagamento.isBlank())) {

			return null;

		}
		try {
			retiradaValidada = Boolean.parseBoolean(retirada);
		} catch (NumberFormatException e) {
			return null;
		}

		return new Pedido(numeroValidado, metodoPagamento, retiradaValidada, entregador);

	}
}