package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import database.Dados;
import model.Entregador;
import model.Pedido;
import view.CadastraPedido;
import view.Pedidos;

public class CadastraPedidoController {

	private final CadastraPedido view;
	private final Mensagens mensagem;

	public CadastraPedidoController(CadastraPedido view) {

		super();
		this.view = view;
		mensagem = new Mensagens();

	}

	public DefaultComboBoxModel<String> gerarListaEntregadores() {

		DefaultComboBoxModel<String> model;
		model = new DefaultComboBoxModel<>();

		for (Entregador element : Dados.getEntregadores()) {
			model.addElement(element.getNome());
		}

		return model;
	}

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