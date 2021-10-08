package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.PedidosController;
import model.Cliente;

/**
 * Parametros da tela de pedidos, onde será dada a opção do usuário realizar o
 * CRUD de pedido.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Pedidos extends JFrame implements ActionListener {

	private final JButton botaoCadastrarPedido;
	private final JButton botaoVoltar;
	private final JButton botaoCriarPedido;
	private final JLabel labelPedido;
	private final PedidosController controllerPedidos;
	private final JList<String> listaPedidos;
	private final Cliente cliente;

	/**
	 * Construtor da tela de pedidos
	 * 
	 * @param cliente
	 */

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
		botaoCadastrarPedido.setBounds(10, 500, 200, 50);
		botaoCadastrarPedido.addActionListener(this);

		botaoCriarPedido = new JButton("Criar Pedido");
		botaoCriarPedido.setBounds(10, 400, 200, 50);
		botaoCriarPedido.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(labelPedido);
		this.add(botaoVoltar);
		this.add(listaPedidos);
		this.add(botaoCadastrarPedido);
		this.add(botaoCriarPedido);

		setVisible(true);
	}

	/**
	 * Listener da tela de pedidos.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerPedidos.pressionarBotaoPedido(e);

	}

	public JButton getBotaoCadastrarPedido() {
		return botaoCadastrarPedido;
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