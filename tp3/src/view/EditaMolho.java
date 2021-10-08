package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EditaMolhoController;
import model.Molho;
import model.Pedido;

/**
 * Parametros para a tela de edição de um molho, onde será inserido as
 * informações que deseja editar.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (out 2021)
 */

public class EditaMolho extends JFrame implements ActionListener {

	private final JButton botaoSalvarMolho;
	private final JButton botaoCancelar;
	private final JLabel labelTamanho;
	private final JLabel labelTela;
	private final JLabel labelPreco;
	private final JLabel labelDescricao;
	private final JLabel labelAcompanhamentos;
	private final JTextField tamanhoMolho;
	private final JTextField precoMolho;
	private final JTextField descricaoMolho;
	private final JTextField tipoDoMolho;
	private final Molho molho;
	private final Pedido pedido;

	private final EditaMolhoController controller;

	/**
	 * Construtor para a tela de edição de um molho, os campos devem vir preenchidos
	 * com as informações que foram cadastradas pelo usuario anteriormente e podem
	 * ou não serem editadas.
	 * 
	 * @param molho
	 * @param pedido
	 */

	public EditaMolho(Molho molho, Pedido pedido) {

		super("Informaçãoes Frango");

		this.molho = molho;
		this.pedido = pedido;
		this.controller = new EditaMolhoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Edição Frango");
		labelTela.setBounds(10, 0, 200, 50);

		labelTamanho = new JLabel("Tamanho");
		labelTamanho.setBounds(10, 50, 200, 50);

		tamanhoMolho = new JTextField(molho.getTamanho() + "");
		tamanhoMolho.setBounds(150, 60, 200, 30);

		labelPreco = new JLabel("Preço");
		labelPreco.setBounds(10, 100, 200, 50);

		precoMolho = new JTextField(molho.getPreco() + "");
		precoMolho.setBounds(150, 110, 200, 30);

		labelDescricao = new JLabel("Descrição");
		labelDescricao.setBounds(10, 150, 200, 50);

		descricaoMolho = new JTextField(molho.getDescricao());
		descricaoMolho.setBounds(150, 160, 200, 30);

		labelAcompanhamentos = new JLabel("Acompanhamento(s)");
		labelAcompanhamentos.setBounds(10, 200, 200, 50);

		tipoDoMolho = new JTextField(molho.getTipo());
		tipoDoMolho.setBounds(150, 210, 200, 30);

		botaoSalvarMolho = new JButton("Salvar");
		botaoSalvarMolho.setBounds(10, 500, 75, 50);
		botaoSalvarMolho.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(100, 500, 100, 50);
		botaoCancelar.addActionListener(this);

		this.add(botaoSalvarMolho);
		this.add(botaoCancelar);
		this.add(labelTela);
		this.add(labelTamanho);
		this.add(labelPreco);
		this.add(labelDescricao);
		this.add(labelAcompanhamentos);
		this.add(tamanhoMolho);
		this.add(descricaoMolho);
		this.add(precoMolho);
		this.add(tipoDoMolho);

	}

	/**
	 * Listener para a tela de edição de um molho
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.pressionarBotaoMolho(e);

	}

	public JButton getBotaoSalvarMolho() {
		return botaoSalvarMolho;
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

	public JTextField getTamanhoMolho() {
		return tamanhoMolho;
	}

	public JTextField getPrecoMolho() {
		return precoMolho;
	}

	public JTextField getDescricaoMolho() {
		return descricaoMolho;
	}

	public JTextField getTipoMolho() {
		return tipoDoMolho;
	}

	public Molho getMolho() {
		return molho;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public EditaMolhoController getController() {
		return controller;
	}

}