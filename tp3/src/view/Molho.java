package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.MolhoController;

public class Molho extends JFrame implements ActionListener {

	private final JButton botaoCadastrarMolho;
	private final JButton botaoEditarMolho;
	private final JButton botaoExcluirMolho;
	private final JLabel labelMolho;

	private final MolhoController controllerMolho;

	public Molho() {

		super("Molho");

		this.controllerMolho = new MolhoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelMolho = new JLabel("Tela Molho");
		labelMolho.setBounds(160, 0, 200, 50);

		botaoCadastrarMolho = new JButton("Cadastrar");
		botaoCadastrarMolho.setBounds(100, 50, 200, 100);
		botaoCadastrarMolho.addActionListener(this);

		botaoEditarMolho = new JButton("Editar");
		botaoEditarMolho.setBounds(100, 175, 200, 100);
		botaoEditarMolho.addActionListener(this);

		botaoExcluirMolho = new JButton("Excluir");
		botaoExcluirMolho.setBounds(100, 300, 200, 100);
		botaoExcluirMolho.addActionListener(this);

		this.add(botaoCadastrarMolho);
		this.add(botaoEditarMolho);
		this.add(botaoExcluirMolho);
		this.add(labelMolho);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerMolho.pressionarBotaoMolho(e);

	}

	public JButton getBotaoCadastrarMolho() {
		return botaoCadastrarMolho;
	}

	public JButton getBotaoEditarMolho() {
		return botaoEditarMolho;
	}

	public JButton getBotaoExcluirMolho() {
		return botaoExcluirMolho;
	}

}