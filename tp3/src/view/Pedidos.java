package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.PedidosController;
import model.Cliente;

public class Pedidos extends JFrame implements ActionListener {

	private final JButton botaoCadastrarPedido;
	private final JButton botaoEditarPedido;
	private final JButton botaoExcluirPedido;
	private final JButton botaoVoltar;
	private final JButton botaoCriarPedido;
	private final JLabel labelPedido;
	private final PedidosController controllerPedidos;
	private final JList<String> listaPedidos;
	private final Cliente cliente;

	public Pedidos(Cliente cliente) {

		super("Pedido");

		this.cliente = cliente;
		this.controllerPedidos = new PedidosController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaPedidos = new JList<>();
		listaPedidos.setModel(controllerPedidos.gerarListaPedidos());
		listaPedidos.setBounds(10, 40, 350, 200);

		labelPedido = new JLabel("Tela de Pedidos");
		labelPedido.setBounds(160, 0, 200, 50);

		botaoCadastrarPedido = new JButton("Realizar Pedido");
		botaoCadastrarPedido.setBounds(10, 500, 120, 50);
		botaoCadastrarPedido.addActionListener(this);

		botaoCriarPedido = new JButton("Criar Pedido");
		botaoCriarPedido.setBounds(140, 500, 100, 50);
		botaoCriarPedido.addActionListener(this);

		botaoEditarPedido = new JButton("Editar Pedido");
		botaoEditarPedido.setBounds(100, 175, 200, 100);
		botaoEditarPedido.addActionListener(this);

		botaoExcluirPedido = new JButton("Excluir Pedido");
		botaoExcluirPedido.setBounds(100, 300, 200, 100);
		botaoExcluirPedido.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarPedido);
		// this.add(botaoEditarPedido);
		// this.add(botaoExcluirPedido);
		this.add(labelPedido);
		this.add(botaoVoltar);
		this.add(listaPedidos);
		this.add(botaoCadastrarPedido);
		this.add(botaoCriarPedido);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerPedidos.pressionarBotaoPedido(e);

	}

	public JButton getBotaoCadastrarPedido() {
		return botaoCadastrarPedido;
	}

	public JButton getBotaoEditarPedido() {
		return botaoEditarPedido;
	}

	public JButton getBotaoExcluirPedido() {
		return botaoExcluirPedido;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JList<String> getListaPedidos() {
		return listaPedidos;
	}

	public JLabel getLabelPedido() {
		return labelPedido;
	}

	public PedidosController getControllerPedidos() {
		return controllerPedidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public JButton getBotaoCriarPedido() {
		return botaoCriarPedido;
	}

}