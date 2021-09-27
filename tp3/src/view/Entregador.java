package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Entregador extends JFrame implements ActionListener {

	private final JButton botaoCadastrarEntragador;
	private final JButton botaoEditarEntregador;
	private final JButton botaoExcluirEntregador;
	private final JLabel labelEntregador;

	public Entregador() {

		super("Entregador");

		this.setSize(400, 600);
		this.setLayout(null);

		labelEntregador = new JLabel("Tela Entregadores");
		labelEntregador.setBounds(160, 0, 200, 50);

		botaoCadastrarEntragador = new JButton("Cadastrar");
		botaoCadastrarEntragador.setBounds(100, 50, 200, 100);
		botaoCadastrarEntragador.addActionListener(this);

		botaoEditarEntregador = new JButton("Editar");
		botaoEditarEntregador.setBounds(100, 175, 200, 100);
		botaoEditarEntregador.addActionListener(this);

		botaoExcluirEntregador = new JButton("Excluir");
		botaoExcluirEntregador.setBounds(100, 300, 200, 100);
		botaoExcluirEntregador.addActionListener(this);

		this.add(botaoCadastrarEntragador);
		this.add(botaoEditarEntregador);
		this.add(botaoExcluirEntregador);
		this.add(labelEntregador);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public JButton getBotaoCadastrarEntragador() {
		return botaoCadastrarEntragador;
	}

	public JButton getBotaoEditarEntregador() {
		return botaoEditarEntregador;
	}

	public JButton getBotaoExcluirEntregador() {
		return botaoExcluirEntregador;
	}

}
