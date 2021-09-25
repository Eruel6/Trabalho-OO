package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Menu extends JFrame implements ActionListener {

	private final JButton botaoPedido;
	private final JButton botaoAlimento;
	private final JButton botaoCliente;
	private final JButton botaoEntregador;
	private final JLabel menuLabel;

	public Menu() {

		super("Menu");

		this.setSize(400, 600);
		this.setLayout(null);

		menuLabel = new JLabel("BEM VINDO !");
		menuLabel.setBounds(160, 0, 200, 50);

		botaoPedido = new JButton("Pedido");
		botaoPedido.setBounds(100, 50, 200, 100);
		botaoPedido.addActionListener(this);

		botaoAlimento = new JButton("Alimento");
		botaoAlimento.setBounds(100, 175, 200, 100);
		botaoAlimento.addActionListener(this);

		botaoCliente = new JButton("Cliente");
		botaoCliente.setBounds(100, 300, 200, 100);
		botaoCliente.addActionListener(this);

		botaoEntregador = new JButton("Entregador");
		botaoEntregador.setBounds(100, 425, 200, 100);
		botaoEntregador.addActionListener(this);

		this.add(botaoPedido);
		this.add(botaoAlimento);
		this.add(botaoCliente);
		this.add(botaoEntregador);
		this.add(menuLabel);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public JButton getBotaoPedido() {
		return botaoPedido;
	}

	public JButton getBotaoAlimento() {
		return botaoAlimento;
	}

	public JButton getBotaoCliente() {
		return botaoCliente;
	}

	public JButton getBotaoEntregador() {
		return botaoEntregador;
	}

}
