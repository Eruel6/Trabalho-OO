package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EditaFrangoController;
import model.FrangoEmpanado;
import model.Pedido;

/**
 * Parametros para a tela de edição de um frango, onde será inserido as
 * informações que deseja editar.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (out 2021)
 */

public class EditaFrango extends JFrame implements ActionListener {

	private final JButton botaoSalvarFrango;
	private final JButton botaoCancelar;
	private final JLabel labelTamanho;
	private final JLabel labelTela;
	private final JLabel labelPreco;
	private final JLabel labelDescricao;
	private final JLabel labelAcompanhamentos;
	private final JTextField tamanhoFrango;
	private final JTextField precoFrango;
	private final JTextField descricaoFrango;
	private final JTextField CorteDoFrango;
	private final FrangoEmpanado frango;
	private final Pedido pedido;

	private final EditaFrangoController controller;

	/**
	 * Construtor para a tela de edição de um cliente, os campos devem vir
	 * preenchidos com as informações que foram cadastradas pelo usuario
	 * anteriormente e podem ou não serem editadas.
	 * 
	 * @param frango
	 * @param pedido
	 */

	public EditaFrango(FrangoEmpanado frango, Pedido pedido) {

		super("Informaçãoes Frango");

		this.frango = frango;
		this.pedido = pedido;
		this.controller = new EditaFrangoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Edição Frango");
		labelTela.setBounds(10, 0, 200, 50);

		labelTamanho = new JLabel("Tamanho");
		labelTamanho.setBounds(10, 50, 200, 50);

		tamanhoFrango = new JTextField(frango.getTamanho() + "");
		tamanhoFrango.setBounds(150, 60, 200, 30);

		labelPreco = new JLabel("Preço");
		labelPreco.setBounds(10, 100, 200, 50);

		precoFrango = new JTextField(frango.getPreco() + "");
		precoFrango.setBounds(150, 110, 200, 30);

		labelDescricao = new JLabel("Descrição");
		labelDescricao.setBounds(10, 150, 200, 50);

		descricaoFrango = new JTextField(frango.getDescricao());
		descricaoFrango.setBounds(150, 160, 200, 30);

		labelAcompanhamentos = new JLabel("Acompanhamento(s)");
		labelAcompanhamentos.setBounds(10, 200, 200, 50);

		CorteDoFrango = new JTextField(frango.getCorteDoFrango());
		CorteDoFrango.setBounds(150, 210, 200, 30);

		botaoSalvarFrango = new JButton("Salvar");
		botaoSalvarFrango.setBounds(10, 500, 75, 50);
		botaoSalvarFrango.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(100, 500, 100, 50);
		botaoCancelar.addActionListener(this);

		this.add(botaoSalvarFrango);
		this.add(botaoCancelar);
		this.add(labelTela);
		this.add(labelTamanho);
		this.add(labelPreco);
		this.add(labelDescricao);
		this.add(labelAcompanhamentos);
		this.add(tamanhoFrango);
		this.add(descricaoFrango);
		this.add(precoFrango);
		this.add(CorteDoFrango);

	}

	/**
	 * Listener para a tela de edição de um frango.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.pressionarBotaoFrango(e);
	}

	public JButton getBotaoSalvarFrango() {
		return botaoSalvarFrango;
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

	public JTextField getTamanhoFrango() {
		return tamanhoFrango;
	}

	public JTextField getPrecoFrango() {
		return precoFrango;
	}

	public JTextField getDescricaoFrango() {
		return descricaoFrango;
	}

	public JTextField getCorteDoFrango() {
		return CorteDoFrango;
	}

	public FrangoEmpanado getFrango() {
		return frango;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public EditaFrangoController getController() {
		return controller;
	}

}