package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.FrangoController;

public class Frango extends JFrame implements ActionListener {

	private final JButton botaoCadastrarFrango;
	private final JButton botaoEditarFrango;
	private final JButton botaoExcluirFrango;
	private final JLabel labelFrango;
	private final FrangoController controllerFrango;

	public Frango() {

		super("Frango");

		this.controllerFrango = new FrangoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelFrango = new JLabel("Tela Frango");
		labelFrango.setBounds(160, 0, 200, 50);

		botaoCadastrarFrango = new JButton("Cadastrar");
		botaoCadastrarFrango.setBounds(100, 50, 200, 100);
		botaoCadastrarFrango.addActionListener(this);

		botaoEditarFrango = new JButton("Editar");
		botaoEditarFrango.setBounds(100, 175, 200, 100);
		botaoEditarFrango.addActionListener(this);

		botaoExcluirFrango = new JButton("Excluir");
		botaoExcluirFrango.setBounds(100, 300, 200, 100);
		botaoExcluirFrango.addActionListener(this);

		this.add(botaoCadastrarFrango);
		this.add(botaoEditarFrango);
		this.add(botaoExcluirFrango);
		this.add(labelFrango);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerFrango.pressionarBotaoFrango(e);

	}

	public JButton getBotaoCadastrarFrango() {
		return botaoCadastrarFrango;
	}

	public JButton getBotaoEditarFrango() {
		return botaoEditarFrango;
	}

	public JButton getBotaoExcluirFrango() {
		return botaoExcluirFrango;
	}

}