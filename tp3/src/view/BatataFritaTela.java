package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.BatataFritaController;

public class BatataFritaTela extends JFrame implements ActionListener {

	private final JButton botaoCadastrarBatataFrita;
	private final JButton botaoEditarBatataFrita;
	private final JButton botaoExcluirBatataFrita;
	private final JLabel labelBatataFrita;

	private final BatataFritaController controllerBatataFrita;

	public BatataFritaTela() {

		super("BatataFrita");

		this.controllerBatataFrita = new BatataFritaController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelBatataFrita = new JLabel("Tela BatataFrita");
		labelBatataFrita.setBounds(160, 0, 200, 50);

		botaoCadastrarBatataFrita = new JButton("Cadastrar");
		botaoCadastrarBatataFrita.setBounds(100, 50, 200, 100);
		botaoCadastrarBatataFrita.addActionListener(this);

		botaoEditarBatataFrita = new JButton("Editar");
		botaoEditarBatataFrita.setBounds(100, 175, 200, 100);
		botaoEditarBatataFrita.addActionListener(this);

		botaoExcluirBatataFrita = new JButton("Excluir");
		botaoExcluirBatataFrita.setBounds(100, 300, 200, 100);
		botaoExcluirBatataFrita.addActionListener(this);

		this.add(botaoCadastrarBatataFrita);
		this.add(botaoEditarBatataFrita);
		this.add(botaoExcluirBatataFrita);
		this.add(labelBatataFrita);

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

}