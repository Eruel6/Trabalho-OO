package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EditaBatataFritaController;
import model.BatataFrita;
import model.Pedido;

/**
 * Parametros para a tela de edi��o de uma batata frita, onde ser� inserido as
 * informa��es que deseja editar.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (out 2021)
 */

public class EditaBatataFrita extends JFrame implements ActionListener {

	private final JButton botaoSalvarBatataFrita;
	private final JButton botaoCancelar;
	private final JLabel labelTamanho;
	private final JLabel labelTela;
	private final JLabel labelPreco;
	private final JLabel labelDescricao;
	private final JLabel labelAcompanhamentos;
	private final JTextField tamanhoBatataFrita;
	private final JTextField precoBatataFrita;
	private final JTextField descricaoBatataFrita;
	private final JTextField acompanhamentoBatataFrita;
	private final BatataFrita batataFrita;
	private final Pedido pedido;

	private final EditaBatataFritaController controller;

	/**
	 * Construtor para a tela de edi��o de uma batata frita, os campos devem vir
	 * preenchidos com as informa��es que foram cadastradas pelo usuario
	 * anteriormente e podem ou n�o serem editadas.
	 * 
	 * @param batataFrita
	 * @param pedido
	 */

	public EditaBatataFrita(BatataFrita batataFrita, Pedido pedido) {

		super("Informa��oes BatataFrita");

		this.batataFrita = batataFrita;
		this.pedido = pedido;
		this.controller = new EditaBatataFritaController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Edi��o BatataFrita");
		labelTela.setBounds(10, 0, 200, 50);

		labelTamanho = new JLabel("Tamanho");
		labelTamanho.setBounds(10, 50, 200, 50);

		tamanhoBatataFrita = new JTextField(batataFrita.getTamanho() + "");
		tamanhoBatataFrita.setBounds(150, 60, 200, 30);

		labelPreco = new JLabel("Pre�o");
		labelPreco.setBounds(10, 100, 200, 50);

		precoBatataFrita = new JTextField(batataFrita.getPreco() + "");
		precoBatataFrita.setBounds(150, 110, 200, 30);

		labelDescricao = new JLabel("Descri��o");
		labelDescricao.setBounds(10, 150, 200, 50);

		descricaoBatataFrita = new JTextField(batataFrita.getDescricao());
		descricaoBatataFrita.setBounds(150, 160, 200, 30);

		labelAcompanhamentos = new JLabel("Acompanhamento(s)");
		labelAcompanhamentos.setBounds(10, 200, 200, 50);

		acompanhamentoBatataFrita = new JTextField(batataFrita.getAcompanhamento());
		acompanhamentoBatataFrita.setBounds(150, 210, 200, 30);

		botaoSalvarBatataFrita = new JButton("Salvar");
		botaoSalvarBatataFrita.setBounds(10, 500, 75, 50);
		botaoSalvarBatataFrita.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(100, 500, 100, 50);
		botaoCancelar.addActionListener(this);

		this.add(botaoSalvarBatataFrita);
		this.add(botaoCancelar);
		this.add(labelTela);
		this.add(labelTamanho);
		this.add(labelPreco);
		this.add(labelDescricao);
		this.add(labelAcompanhamentos);
		this.add(tamanhoBatataFrita);
		this.add(descricaoBatataFrita);
		this.add(precoBatataFrita);
		this.add(acompanhamentoBatataFrita);

	}

	/**
	 * Listener para a tela de edi��o de uma batat frita.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		controller.pressionarBotaoBatataFrita(e);

	}

	public JButton getBotaoSalvarBatataFrita() {
		return botaoSalvarBatataFrita;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public JLabel getLabelTamanho() {
		return labelTamanho;
	}

	public JLabel getLabelTela() {
		return labelTela;
	}

	public JLabel getLabelPreco() {
		return labelPreco;
	}

	public JLabel getLabelDescricao() {
		return labelDescricao;
	}

	public JLabel getLabelAcompanhamentos() {
		return labelAcompanhamentos;
	}

	public JTextField getTamanhoBatataFrita() {
		return tamanhoBatataFrita;
	}

	public JTextField getPrecoBatataFrita() {
		return precoBatataFrita;
	}

	public JTextField getDescricaoBatataFrita() {
		return descricaoBatataFrita;
	}

	public JTextField getAcompanhamentoBatataFrita() {
		return acompanhamentoBatataFrita;
	}

	public BatataFrita getBatataFrita() {
		return batataFrita;
	}

	public EditaBatataFritaController getController() {
		return controller;
	}

	public Pedido getPedido() {
		return pedido;
	}

}