package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.MolhoController;
import model.Pedido;

public class MolhoTela extends JFrame implements ActionListener {

	private final JButton botaoCadastrarMolho;
	private final JButton botaoEditarMolho;
	private final JButton botaoExcluirMolho;
	private final JButton botaoVoltar;
	private final JButton botaoAdicionarMolho;
	private final JLabel labelMolho;
	private final JList<String> listaMolhos;
	private final Pedido pedido;

	private final MolhoController controllerMolho;

	public MolhoTela(Pedido pedido) {

		super("Molho");

		this.pedido = pedido;
		this.controllerMolho = new MolhoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaMolhos = new JList<>();
		listaMolhos.setModel(controllerMolho.gerarListaMolho());
		listaMolhos.setBounds(10, 40, 350, 200);

		labelMolho = new JLabel("Tela Molho");
		labelMolho.setBounds(160, 0, 200, 50);

		botaoAdicionarMolho = new JButton("Adicionar");
		botaoAdicionarMolho.setBounds(250, 360, 100, 60);
		botaoAdicionarMolho.addActionListener(this);

		botaoCadastrarMolho = new JButton("Cadastrar");
		botaoCadastrarMolho.setBounds(30, 270, 100, 60);
		botaoCadastrarMolho.addActionListener(this);

		botaoEditarMolho = new JButton("Editar");
		botaoEditarMolho.setBounds(30, 360, 100, 60);
		botaoEditarMolho.addActionListener(this);

		botaoExcluirMolho = new JButton("Excluir");
		botaoExcluirMolho.setBounds(30, 450, 100, 60);
		botaoExcluirMolho.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarMolho);
		this.add(botaoEditarMolho);
		this.add(botaoExcluirMolho);
		this.add(labelMolho);
		this.add(botaoVoltar);
		this.add(listaMolhos);
		this.add(botaoAdicionarMolho);

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

	public JButton getBotaoAdicionarMolho() {
		return botaoAdicionarMolho;
	}

	public JList<String> getListaMolhos() {
		return listaMolhos;
	}

	public JLabel getLabelMolho() {
		return labelMolho;
	}

	public MolhoController getControllerMolho() {
		return controllerMolho;
	}

	public Pedido getPedido() {
		return pedido;
	}

}