package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CadastraClienteController;

/**
 * Parametros para a tela de cadastro de um cliente, onde será inserido as
 * informações que deseja cadastrar.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (out 2021)
 */

public class CadastraCliente extends JFrame implements ActionListener {

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
	private final CadastraClienteController controller;

	/**
	 * Construtor da tela de cadastro de um cliente
	 */

	public CadastraCliente() {

		super("Informaçãoes Clientes");

		controller = new CadastraClienteController(this);

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

	/**
	 * Listener para a tela de cadastro de cliente
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		controller.pressionarBotaoCliente(e);

	}

	public JButton getBotaoSalvarCliente() {
		return botaoSalvarCliente;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public JLabel getLabelTela() {
		return labelTela;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public JLabel getLabelEndereco() {
		return labelEndereco;
	}

	public JLabel getLabelCpf() {
		return labelCpf;
	}

	public JLabel getLabelTelefone() {
		return labelTelefone;
	}

	public JTextField getNomeCliente() {
		return nomeCliente;
	}

	public JTextField getEnderecoCliente() {
		return enderecoCliente;
	}

	public JTextField getCpfCliente() {
		return cpfCliente;
	}

	public JTextField getTelefoneCliente() {
		return telefoneCliente;
	}

	public CadastraClienteController getController() {
		return controller;
	}

}