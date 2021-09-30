package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.EntregadorController;

public class EntregadorTela extends JFrame implements ActionListener {

	private final JButton botaoCadastrarEntregador;
	private final JButton botaoEditarEntregador;
	private final JButton botaoExcluirEntregador;
	private final JLabel labelEntregador;

	private final EntregadorController controllerEntregador;

	public EntregadorTela() {

		super("Entregador");

		this.controllerEntregador = new EntregadorController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelEntregador = new JLabel("Tela Entregadores");
		labelEntregador.setBounds(160, 0, 200, 50);

		botaoCadastrarEntregador = new JButton("Cadastrar");
		botaoCadastrarEntregador.setBounds(100, 50, 200, 100);
		botaoCadastrarEntregador.addActionListener(this);

		botaoEditarEntregador = new JButton("Editar");
		botaoEditarEntregador.setBounds(100, 175, 200, 100);
		botaoEditarEntregador.addActionListener(this);

		botaoExcluirEntregador = new JButton("Excluir");
		botaoExcluirEntregador.setBounds(100, 300, 200, 100);
		botaoExcluirEntregador.addActionListener(this);

		this.add(botaoCadastrarEntregador);
		this.add(botaoEditarEntregador);
		this.add(botaoExcluirEntregador);
		this.add(labelEntregador);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerEntregador.pressionarBotaoEntregador(e);

	}

	public JButton getBotaoCadastrarEntragador() {
		return botaoCadastrarEntregador;
	}

	public JButton getBotaoEditarEntregador() {
		return botaoEditarEntregador;
	}

	public JButton getBotaoExcluirEntregador() {
		return botaoExcluirEntregador;
	}

}
