package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.AlimentosController;
import model.Pedido;

/**
 * Parametros da tela de alimentos, onde serão dadas as opçoes de realizar um
 * CRUD de um frango, uma batat frita ou um molho
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Alimento extends JFrame implements ActionListener {

	private final JButton botaoFrango;
	private final JButton botaoBatataFrita;
	private final JButton botaoMolho;
	private final JButton botaoVoltar;
	private final JLabel labelAlimento;
	private final AlimentosController controllerAlimento;
	private final Pedido pedido;

	/**
	 * Construtor da classe que define a tela de alimentos.
	 * 
	 * @param pedido
	 */

	public Alimento(Pedido pedido) {

		super("Alimento");

		this.pedido = pedido;
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

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoFrango);
		this.add(botaoBatataFrita);
		this.add(botaoMolho);
		this.add(labelAlimento);
		this.add(botaoVoltar);

		setVisible(true);
	}

	/**
	 * Listener para a tela de alimentos
	 */

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

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JLabel getLabelAlimento() {
		return labelAlimento;
	}

	public AlimentosController getControllerAlimento() {
		return controllerAlimento;
	}

	public Pedido getPedido() {
		return pedido;
	}

}