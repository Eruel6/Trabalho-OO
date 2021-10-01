package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.BatataFritaController;
import model.Pedido;

public class BatataFritaTela extends JFrame implements ActionListener {

	private final JButton botaoCadastrarBatataFrita;
	private final JButton botaoEditarBatataFrita;
	private final JButton botaoExcluirBatataFrita;
	private final JButton botaoVoltar;
	private final JButton botaoAdicionarBatata;
	private final JLabel labelBatataFrita;
	private final JList<String> listaBatatas;
	private final Pedido pedido;

	private final BatataFritaController controllerBatataFrita;

	public BatataFritaTela(Pedido pedido) {

		super("BatataFrita");

		this.pedido = pedido;
		this.controllerBatataFrita = new BatataFritaController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaBatatas = new JList<>();
		listaBatatas.setModel(controllerBatataFrita.gerarListaBatataFrita());
		listaBatatas.setBounds(10, 40, 350, 200);

		labelBatataFrita = new JLabel("Tela BatataFrita");
		labelBatataFrita.setBounds(160, 0, 200, 50);

		botaoAdicionarBatata = new JButton("Adicionar");
		botaoAdicionarBatata.setBounds(250, 360, 100, 60);
		botaoAdicionarBatata.addActionListener(this);

		botaoCadastrarBatataFrita = new JButton("Cadastrar");
		botaoCadastrarBatataFrita.setBounds(30, 270, 100, 60);
		botaoCadastrarBatataFrita.addActionListener(this);

		botaoEditarBatataFrita = new JButton("Editar");
		botaoEditarBatataFrita.setBounds(30, 360, 100, 60);
		botaoEditarBatataFrita.addActionListener(this);

		botaoExcluirBatataFrita = new JButton("Excluir");
		botaoExcluirBatataFrita.setBounds(30, 450, 100, 60);
		botaoExcluirBatataFrita.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarBatataFrita);
		this.add(botaoEditarBatataFrita);
		this.add(botaoExcluirBatataFrita);
		this.add(labelBatataFrita);
		this.add(botaoVoltar);
		this.add(listaBatatas);
		this.add(botaoAdicionarBatata);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerBatataFrita.pressionarBotaoBatataFrita(e);

	}

	public JButton getBotaoCadastrarBatataFrita() {
		return botaoCadastrarBatataFrita;
	}

	public JButton getBotaoEditarBatataFrita() {
		return botaoEditarBatataFrita;
	}

	public JButton getBotaoExcluirBatataFrita() {
		return botaoExcluirBatataFrita;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JButton getBotaoAdicionarBatata() {
		return botaoAdicionarBatata;
	}

	public JList<String> getListaBatatas() {
		return listaBatatas;
	}

	public JLabel getLabelBatataFrita() {
		return labelBatataFrita;
	}

	public BatataFritaController getControllerBatataFrita() {
		return controllerBatataFrita;
	}

	public Pedido getPedido() {
		return pedido;
	}

}
