package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.AlimentosController;

public class Alimento extends JFrame implements ActionListener {

	private final JButton botaoFrango;
	private final JButton botaoBatataFrita;
	private final JButton botaoMolho;
	private final JLabel labelAlimento;
	private final AlimentosController controllerAlimento;

	public Alimento() {

		super("Alimento");

		this.controllerAlimento = new AlimentosController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelAlimento = new JLabel("Tela de Alimentos");
		labelAlimento.setBounds(160, 0, 200, 50);

		botaoFrango = new JButton("Frango");
		botaoFrango.setBounds(100, 50, 200, 100);
		botaoFrango.addActionListener(this);

		botaoBatataFrita = new JButton("Batata Frita");
		botaoBatataFrita.setBounds(100, 175, 200, 100);
		botaoBatataFrita.addActionListener(this);

		botaoMolho = new JButton("Molho");
		botaoMolho.setBounds(100, 300, 200, 100);
		botaoMolho.addActionListener(this);

		this.add(botaoFrango);
		this.add(botaoBatataFrita);
		this.add(botaoMolho);
		this.add(labelAlimento);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerAlimento.pressionarBotaoAlimento(e);

	}

	public JButton getBotaoFrango() {
		return botaoFrango;
	}

	public JButton getBotaoBatataFrita() {
		return botaoBatataFrita;
	}

	public JButton getBotaoMolho() {
		return botaoMolho;
	}

}