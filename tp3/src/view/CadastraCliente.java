package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.Mensagens;

public class CadastraCliente extends JFrame implements ActionListener {

	private String novoCliente[] = new String[9];

	private final JButton botaoSalvarCliente;
	private final JButton botaoCancelar;
	private final JLabel labelTela;
	private final JLabel labelNome;
	private final JLabel labelEndereco;
	private final JLabel labelCpf;
	private final JLabel labelTelefone;
	private JTextField nomeCliente;
	private JTextField enderecoCliente;
	private JTextField cpfCliente;
	private JTextField telefoneCliente;

	public CadastraCliente() {

		super("Informaçãoes Clientes");

		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Cadastro Cliente");
		labelTela.setBounds(10, 0, 200, 50);

		labelNome = new JLabel("Nome do cliente");
		labelNome.setBounds(10, 50, 200, 50);

		nomeCliente = new JTextField(200);
		nomeCliente.setBounds(150, 60, 200, 30);

		labelEndereco = new JLabel("Endereco do cliente");
		labelEndereco.setBounds(10, 100, 200, 50);

		enderecoCliente = new JTextField(200);
		enderecoCliente.setBounds(150, 110, 200, 30);

		labelCpf = new JLabel("CPF do Cliente");
		labelCpf.setBounds(10, 150, 200, 50);

		cpfCliente = new JTextField(200);
		cpfCliente.setBounds(150, 160, 200, 30);

		labelTelefone = new JLabel("Telefone do Cliente");
		labelTelefone.setBounds(10, 200, 200, 50);

		telefoneCliente = new JTextField(200);
		telefoneCliente.setBounds(150, 210, 200, 30);

		botaoSalvarCliente = new JButton("Salvar");
		botaoSalvarCliente.setBounds(10, 500, 75, 50);
		botaoSalvarCliente.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(100, 500, 100, 50);
		botaoCancelar.addActionListener(this);

		this.add(botaoSalvarCliente);
		this.add(botaoCancelar);
		this.add(labelTela);
		this.add(labelNome);
		this.add(labelEndereco);
		this.add(labelCpf);
		this.add(labelTelefone);
		this.add(nomeCliente);
		this.add(enderecoCliente);
		this.add(cpfCliente);
		this.add(telefoneCliente);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == botaoSalvarCliente) {

			novoCliente[0] = nomeCliente.getText();
			novoCliente[1] = enderecoCliente.getText();
			novoCliente[2] = cpfCliente.getText();
			novoCliente[3] = telefoneCliente.getText();

			Mensagens mensagens = new Mensagens();
			mensagens.mensagemSucessoCadastro();

			CadastraCliente.this.dispose();

			/*
			 * System.out.println(novoFrango[0]); System.out.println(novoFrango[1]);
			 * System.out.println(novoFrango[2]); System.out.println(novoFrango[3]);
			 */
		} else if (source == botaoCancelar) {
			CadastraCliente.this.dispose();
		}

	}
}