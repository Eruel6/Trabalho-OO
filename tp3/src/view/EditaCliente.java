package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EditaClienteController;
import model.Cliente;

/**
 * Parametros para a tela de edição de um cliente, onde será inserido as
 * informações que deseja editar.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (out 2021)
 */

public class EditaCliente extends JFrame implements ActionListener {

	private final JButton botaoSalvarCliente;
	private final JButton botaoCancelar;
	private final JLabel labelTela;
	private final JLabel labelNome;
	private final JLabel labelEndereco;
	private final JLabel labelCpf;
	private final JLabel labelTelefone;
	private final JTextField nomeCliente;
	private final JTextField enderecoCliente;
	private final JTextField cpfCliente;
	private final JTextField telefoneCliente;
	private final Cliente cliente;
	private final EditaClienteController controller;

	/**
	 * Construtor para a tela de edição de um cliente, os campos devem vir
	 * preenchidos com as informações que foram cadastradas pelo usuario
	 * anteriormente e podem ou não serem editadas.
	 * 
	 * @param cliente
	 */

	public EditaCliente(Cliente cliente) {

		super("Informaçãoes Clientes");

		this.controller = new EditaClienteController(this);
		this.cliente = cliente;
		this.setSize(400, 600);
		this.setLayout(null);

		labelTela = new JLabel("Tela Edição Cliente");
		labelTela.setBounds(10, 0, 200, 50);

		labelNome = new JLabel("Nome do cliente");
		labelNome.setBounds(10, 50, 200, 50);

		nomeCliente = new JTextField(cliente.getNome());
		nomeCliente.setBounds(150, 60, 200, 30);

		labelEndereco = new JLabel("Endereco do cliente");
		labelEndereco.setBounds(10, 100, 200, 50);

		enderecoCliente = new JTextField(cliente.getEndereco());
		enderecoCliente.setBounds(150, 110, 200, 30);

		labelCpf = new JLabel("CPF do Cliente");
		labelCpf.setBounds(10, 150, 200, 50);

		cpfCliente = new JTextField(cliente.getCpf());
		cpfCliente.setBounds(150, 160, 200, 30);

		labelTelefone = new JLabel("Telefone do Cliente");
		labelTelefone.setBounds(10, 200, 200, 50);

		telefoneCliente = new JTextField(cliente.getTelefone());
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
	 * Listener para a tela de edição de um cliente.
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

	public Cliente getCliente() {
		return cliente;
	}

}