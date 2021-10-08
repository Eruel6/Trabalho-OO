package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CadastraMolhoController;
import model.Pedido;

/**
 * Parametros para a tela de cadastro de um molho, onde será inserido as
 * informações que deseja cadastrar.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (out 2021)
 */

public class CadastraMolho extends JFrame implements ActionListener {

	private final JButton botaoSalvarMolho;
	private final JButton botaoCancelar;
	private final JLabel labelTamanho;
	private final JLabel labelTela;
	private final JLabel labelPreco;
	private final JLabel labelDescricao;
	private final JLabel labelTipo;
	private final JTextField tamanhoMolho;
	private final JTextField precoMolho;
	private final JTextField descricaoMolho;
	private final JTextField tipoMolho;
	private final CadastraMolhoController controller;
	private final Pedido pedido;

	/**
	 * Construtor da tela de cadastro de um pedido
	 * 
	 * @param pedido
	 */

	public CadastraMolho(Pedido pedido) {

		super("Informaçãoes Molho");

		controller = new CadastraMolhoController(this);

		this.pedido = pedido;
		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Cadastro Molho");
		labelTela.setBounds(10, 0, 200, 50);

		labelTamanho = new JLabel("Tamanho");
		labelTamanho.setBounds(10, 50, 200, 50);

		tamanhoMolho = new JTextField(200);
		tamanhoMolho.setBounds(150, 60, 200, 30);

		labelPreco = new JLabel("Preço");
		labelPreco.setBounds(10, 100, 200, 50);

		precoMolho = new JTextField(200);
		precoMolho.setBounds(150, 110, 200, 30);

		labelDescricao = new JLabel("Descrição");
		labelDescricao.setBounds(10, 150, 200, 50);

		descricaoMolho = new JTextField(200);
		descricaoMolho.setBounds(150, 160, 200, 30);

		labelTipo = new JLabel("Tipo do Molho");
		labelTipo.setBounds(10, 200, 200, 50);

		tipoMolho = new JTextField(200);
		tipoMolho.setBounds(150, 210, 200, 30);

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
		this.add(labelTipo);
		this.add(tamanhoMolho);
		this.add(descricaoMolho);
		this.add(precoMolho);
		this.add(tipoMolho);

	}

	/**
	 * Listener para a tela de cadastro de um molho.
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

	public JLabel getLabelTipo() {
		return labelTipo;
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
		return tipoMolho;
	}

	public CadastraMolhoController getController() {
		return controller;
	}

	public Pedido getPedido() {
		return pedido;
	}

}