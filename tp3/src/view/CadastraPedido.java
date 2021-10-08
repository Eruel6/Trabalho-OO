package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CadastraPedidoController;
import model.Cliente;

/**
 * Parametros para a tela de cadastro de um pedido, onde será inserido as
 * informações que deseja cadastrar.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (out 2021)
 */

public class CadastraPedido extends JFrame implements ActionListener {

	private final JButton botaoSalvarPedido;
	private final JButton botaoCancelar;
	private final JLabel labelEntregador;
	private final JLabel labelTela;
	private final JLabel labelNumero;
	private final JLabel labelMetodoPagamento;
	private final JLabel labelRetirada;
	private final JTextField numeroPedido;
	private final JTextField metodoPagamentoPedido;
	private final JTextField retiradaPedido;
	private final CadastraPedidoController controller;
	private final Cliente cliente;
	private final JComboBox<String> listaEntregadores;

	/**
	 * Construtor da tela de cadastro de um pedido.
	 * 
	 * @param cliente
	 */

	public CadastraPedido(Cliente cliente) {

		super("Informaçãoes Pedido");

		controller = new CadastraPedidoController(this);

		this.cliente = cliente;
		this.setSize(400, 600);
		this.setLayout(null);

		this.listaEntregadores = new JComboBox<>();
		this.listaEntregadores.setModel(controller.gerarListaEntregadores());
		this.listaEntregadores.setBounds(10, 250, 200, 50);

		labelTela = new JLabel("Tela Cadastro Pedido");
		labelTela.setBounds(10, 0, 200, 50);

		labelNumero = new JLabel("Numero do pedido");
		labelNumero.setBounds(10, 50, 200, 50);

		numeroPedido = new JTextField(200);
		numeroPedido.setBounds(150, 60, 200, 30);

		labelMetodoPagamento = new JLabel("Metodo de Pagamento");
		labelMetodoPagamento.setBounds(10, 100, 200, 50);

		metodoPagamentoPedido = new JTextField(200);
		metodoPagamentoPedido.setBounds(150, 110, 200, 30);

		labelRetirada = new JLabel("Retirar pedido?");
		labelRetirada.setBounds(10, 150, 200, 50);

		retiradaPedido = new JTextField(200);
		retiradaPedido.setBounds(150, 160, 200, 30);

		labelEntregador = new JLabel("Dados Entregador");
		labelEntregador.setBounds(10, 200, 200, 50);

		botaoSalvarPedido = new JButton("Salvar");
		botaoSalvarPedido.setBounds(10, 500, 75, 50);
		botaoSalvarPedido.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(100, 500, 100, 50);
		botaoCancelar.addActionListener(this);

		this.add(botaoSalvarPedido);
		this.add(botaoCancelar);
		this.add(labelTela);
		this.add(labelNumero);
		this.add(metodoPagamentoPedido);
		this.add(labelRetirada);
		this.add(labelEntregador);
		this.add(numeroPedido);
		this.add(labelMetodoPagamento);
		this.add(retiradaPedido);
		this.add(listaEntregadores);

	}

	/**
	 * Listener para a tela de cadastro de um pedido.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		controller.pressionarBotaoPedido(e);

	}

	public JButton getBotaoSalvarPedido() {
		return botaoSalvarPedido;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public JLabel getLabelEntregador() {
		return labelEntregador;
	}

	public JLabel getLabelTela() {
		return labelTela;
	}

	public JLabel getLabelNumero() {
		return labelNumero;
	}

	public JLabel getLabelMetodoPagamento() {
		return labelMetodoPagamento;
	}

	public JLabel getLabelRetirada() {
		return labelRetirada;
	}

	public JTextField getNumeroPedido() {
		return numeroPedido;
	}

	public JTextField getMetodoPagamentoPedido() {
		return metodoPagamentoPedido;
	}

	public JTextField getRetiradaPedido() {
		return retiradaPedido;
	}

//	public JTextField getEntregadorPedido() {
//		return entregadorPedido;
//	}

	public CadastraPedidoController getController() {
		return controller;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public JComboBox<String> getListaEntregadores() {
		return listaEntregadores;
	}

}
