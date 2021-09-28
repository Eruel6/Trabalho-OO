package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Mensagens;

public class CadastraBatataFrita extends JFrame implements ActionListener {

	private String novaBatataFrita[] = new String[9];

	private final JButton botaoSalvarBatataFrita;
	private final JButton botaoCancelar;
	private final JLabel labelTamanho;
	private final JLabel labelTela;
	private final JLabel labelPreco;
	private final JLabel labelDescricao;
	private final JLabel labelAcompanhamentos;
	private JTextField tamanhoBatataFrita;
	private JTextField precoBatataFrita;
	private JTextField descricaoBatataFrita;
	private JTextField acompanhamentoBatataFrita;
	// private final JLabel labelCliente;

	public CadastraBatataFrita() {

		super("Informaçãoes BatataFrita");

		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Cadastro BatataFrita");
		labelTela.setBounds(10, 0, 200, 50);

		labelTamanho = new JLabel("Tamanho");
		labelTamanho.setBounds(10, 50, 200, 50);

		tamanhoBatataFrita = new JTextField(200);
		tamanhoBatataFrita.setBounds(150, 60, 200, 30);

		labelPreco = new JLabel("Preço");
		labelPreco.setBounds(10, 100, 200, 50);

		precoBatataFrita = new JTextField(200);
		precoBatataFrita.setBounds(150, 110, 200, 30);

		labelDescricao = new JLabel("Descrição");
		labelDescricao.setBounds(10, 150, 200, 50);

		descricaoBatataFrita = new JTextField(200);
		descricaoBatataFrita.setBounds(150, 160, 200, 30);

		labelAcompanhamentos = new JLabel("Acompanhamento(s)");
		labelAcompanhamentos.setBounds(10, 200, 200, 50);

		acompanhamentoBatataFrita = new JTextField(200);
		acompanhamentoBatataFrita.setBounds(150, 210, 200, 30);

		botaoSalvarBatataFrita = new JButton("Salvar");
		botaoSalvarBatataFrita.setBounds(10, 500, 75, 50);
		botaoSalvarBatataFrita.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(100, 500, 75, 50);
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

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == botaoSalvarBatataFrita) {

			novaBatataFrita[0] = tamanhoBatataFrita.getText();
			novaBatataFrita[1] = descricaoBatataFrita.getText();
			novaBatataFrita[2] = precoBatataFrita.getText();
			novaBatataFrita[3] = acompanhamentoBatataFrita.getText();

			Mensagens mensagens = new Mensagens();
			mensagens.mensagemSucessoCadastro();

			CadastraBatataFrita.this.dispose();

			/*
			 * System.out.println(novoFrango[0]); System.out.println(novoFrango[1]);
			 * System.out.println(novoFrango[2]); System.out.println(novoFrango[3]);
			 */
		}

	}
}