package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CadastraFrangoController;

public class CadastraFrango extends JFrame implements ActionListener {

	private final JButton botaoSalvarFrango;
	private final JButton botaoCancelar;
	private final JLabel labelTamanho;
	private final JLabel labelTela;
	private final JLabel labelPreco;
	private final JLabel labelDescricao;
	private final JLabel labelCorteDoFrango;
	private final JTextField tamanhoFrango;
	private final JTextField precoFrango;
	private final JTextField descricaoFrango;
	private final JTextField corteDoFrango;
	private final CadastraFrangoController controller;

	public CadastraFrango() {

		super("Informaçãoes Frango");

		this.controller = new CadastraFrangoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Cadastro Frango");
		labelTela.setBounds(10, 0, 200, 50);

		labelTamanho = new JLabel("Tamanho");
		labelTamanho.setBounds(10, 50, 200, 50);

		tamanhoFrango = new JTextField(200);
		tamanhoFrango.setBounds(150, 60, 200, 30);

		labelPreco = new JLabel("Preço");
		labelPreco.setBounds(10, 100, 200, 50);

		precoFrango = new JTextField(200);
		precoFrango.setBounds(150, 110, 200, 30);

		labelDescricao = new JLabel("Descrição");
		labelDescricao.setBounds(10, 150, 200, 50);

		descricaoFrango = new JTextField(200);
		descricaoFrango.setBounds(150, 160, 200, 30);

		labelCorteDoFrango = new JLabel("Corte do Frango");
		labelCorteDoFrango.setBounds(10, 200, 200, 50);

		corteDoFrango = new JTextField(200);
		corteDoFrango.setBounds(150, 210, 200, 30);

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
		this.add(labelCorteDoFrango);
		this.add(tamanhoFrango);
		this.add(descricaoFrango);
		this.add(precoFrango);
		this.add(corteDoFrango);

	}

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

	public JLabel getLabelCorteDoFrango() {
		return labelCorteDoFrango;
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
		return corteDoFrango;
	}

}