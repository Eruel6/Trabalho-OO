package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cliente extends JFrame implements ActionListener {

	private final JButton botaoCadastrarCliente;
	private final JButton botaoEditarCliente;
	private final JButton botaoExcluirCliente;
	private final JLabel labelCliente;

	public Cliente() {

		super("Cliente");

		this.setSize(400, 600);
		this.setLayout(null);

		labelCliente = new JLabel("Tela Clientes");
		labelCliente.setBounds(160, 0, 200, 50);

		botaoCadastrarCliente = new JButton("Cadastrar");
		botaoCadastrarCliente.setBounds(100, 50, 200, 100);
		botaoCadastrarCliente.addActionListener(this);

		botaoEditarCliente = new JButton("Editar");
		botaoEditarCliente.setBounds(100, 175, 200, 100);
		botaoEditarCliente.addActionListener(this);

		botaoExcluirCliente = new JButton("Excluir");
		botaoExcluirCliente.setBounds(100, 300, 200, 100);
		botaoExcluirCliente.addActionListener(this);

		this.add(botaoCadastrarCliente);
		this.add(botaoEditarCliente);
		this.add(botaoExcluirCliente);
		this.add(labelCliente);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public JButton getBotaoCadastrarCliente() {
		return botaoCadastrarCliente;
	}

	public JButton getBotaoEditarCliente() {
		return botaoEditarCliente;
	}

	public JButton getBotaoExcluirCliente() {
		return botaoExcluirCliente;
	}

}
