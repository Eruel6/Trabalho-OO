package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.MolhoController;

public class MolhoTela extends JFrame implements ActionListener {

	private final JButton botaoCadastrarMolho;
	private final JButton botaoEditarMolho;
	private final JButton botaoExcluirMolho;
	private final JButton botaoVoltar;
	private final JLabel labelMolho;
	private JList<String> listaMolhos;

	private final MolhoController controllerMolho;

	public MolhoTela() {

		super("Molho");

		this.controllerMolho = new MolhoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaMolhos = new JList<String>();
		listaMolhos.setModel(controllerMolho.gerarListaMolho());
		listaMolhos.setBounds(10, 40, 350, 200);

		labelMolho = new JLabel("Tela Molho");
		labelMolho.setBounds(160, 0, 200, 50);

		botaoCadastrarMolho = new JButton("Cadastrar");
		botaoCadastrarMolho.setBounds(30, 500, 100, 50);
		botaoCadastrarMolho.addActionListener(this);

		botaoEditarMolho = new JButton("Editar");
		botaoEditarMolho.setBounds(100, 175, 200, 100);
		botaoEditarMolho.addActionListener(this);

		botaoExcluirMolho = new JButton("Excluir");
		botaoExcluirMolho.setBounds(100, 300, 200, 100);
		botaoExcluirMolho.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarMolho);
		// this.add(botaoEditarMolho);
		// this.add(botaoExcluirMolho);
		this.add(labelMolho);
		this.add(botaoVoltar);
		this.add(listaMolhos);

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

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

}