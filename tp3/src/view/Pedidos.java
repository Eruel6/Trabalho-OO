package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pedidos extends JFrame implements ActionListener {

	private final JButton botaoCadastrarPedido;
	private final JButton botaoEditarPedido;
	private final JButton botaoExcluirPedido;
	private final JButton botaoVoltar;
	private final JLabel labelPedido;

	public Pedidos() {

		super("Pedido");

		this.setSize(400, 600);
		this.setLayout(null);

		labelPedido = new JLabel("Tela de Pedidos");
		labelPedido.setBounds(160, 0, 200, 50);

		botaoCadastrarPedido = new JButton("Cadastrar Pedido");
		botaoCadastrarPedido.setBounds(100, 50, 200, 100);
		botaoCadastrarPedido.addActionListener(this);

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
		this.add(botaoEditarPedido);
		this.add(botaoExcluirPedido);
		this.add(labelPedido);
		this.add(botaoVoltar);

		setVisible(true);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}
}
