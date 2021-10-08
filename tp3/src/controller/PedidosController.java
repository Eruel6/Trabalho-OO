package controller;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import model.Pedido;
import view.Alimento;
import view.CadastraPedido;
import view.ClienteTela;
import view.Pedidos;

public class PedidosController {

	private final Pedidos view;

	public PedidosController(Pedidos view) {

		super();
		this.view = view;

	}

	public DefaultListModel<String> gerarListaPedidos() {

		DefaultListModel<String> model;
		model = new DefaultListModel<>();
		var listaPedidos = view.getCliente().getPedidos();

		for (Pedido pedido : listaPedidos) {

			model.addElement("Pedido" + pedido.getNumero());
		}

		return model;
	}

	public void pressionarBotaoPedido(ActionEvent e) {

		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotaoCadastrarPedido()) {

			int selectedIndex = view.getListaPedidos().getSelectedIndex();
			Pedido pedidoSelecionado = view.getCliente().getPedidos().get(selectedIndex);
			new Alimento(pedidoSelecionado).setVisible(true);
			this.view.dispose();

		}

		if (botaoPressionado == view.getBotaoCriarPedido()) {

//			Pedido modelo = CadastraPedidoController.validaDados();
//			view.getCliente().getPedidos().add(new Pedido(CadastraPedidoController.validaDados()));
			new CadastraPedido(view.getCliente()).setVisible(true);
			this.view.dispose();
		}

		if (botaoPressionado == view.getBotaoVoltar()) {

			new ClienteTela().setVisible(true);
			this.view.dispose();

		}
	}

//	public InserirEditarFrango() {

}
