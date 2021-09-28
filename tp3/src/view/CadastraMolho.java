package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Mensagens;

public class CadastraMolho extends JFrame implements ActionListener {

	private String novoMolho[] = new String[9];

	private final JButton botaoSalvarMolho;
	private final JButton botaoCancelar;
	private final JLabel labelTamanho;
	private final JLabel labelTela;
	private final JLabel labelPreco;
	private final JLabel labelDescricao;
	private final JLabel labelTipo;
	private JTextField tamanhoMolho;
	private JTextField precoMolho;
	private JTextField descricaoMolho;
	private JTextField tipoMolho;
	// private final JLabel labelCliente;

	public CadastraMolho() {

		super("Informaçãoes Molho");

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
		botaoCancelar.setBounds(100, 500, 75, 50);
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

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == botaoSalvarMolho) {

			novoMolho[0] = tamanhoMolho.getText();
			novoMolho[1] = descricaoMolho.getText();
			novoMolho[2] = precoMolho.getText();
			novoMolho[3] = tipoMolho.getText();

			Mensagens mensagens = new Mensagens();
			mensagens.mensagemSucessoCadastro();

			CadastraMolho.this.dispose();

			/*
			 * System.out.println(novoFrango[0]); System.out.println(novoFrango[1]);
			 * System.out.println(novoFrango[2]); System.out.println(novoFrango[3]);
			 */
		}

	}
}