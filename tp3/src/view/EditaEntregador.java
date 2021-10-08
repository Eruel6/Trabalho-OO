package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EditaEntregadorController;
import model.Entregador;

public class EditaEntregador extends JFrame implements ActionListener {

//	-------------------Labels Entregador
	private final JButton botaoSalvarEntregador;
	private final JButton botaoCancelar;
	private final JLabel labelTela;
	private final JLabel labelNomeEntregador;
	private final JLabel labelEnderecoEntregador;
	private final JLabel labelCpfEntregador;
	private final JLabel labelModalidadeEntregador;
	private final JLabel labelNotaEntregador;

//	-------------------Labels Conta Bancaria
	private final JLabel labelContaEntregador;
	private final JLabel labelBancoContaEntregador;
	private final JLabel labelAgenciaContaEntregador;
	private final JLabel labelNumeroContaEntregador;

//	==================== CRUD Entregador
	private final JTextField nomeEntregador;
	private final JTextField enderecoEntregador;
	private final JTextField cpfEntregador;
	private final JTextField modalidadeEntregador;
	private final JTextField notaEntregador;

//	---------------- CRUD ContaBancaria
	private final JTextField bancoContaEntregador;
	private final JTextField agenciaContaEntregador;
	private final JTextField numeroContaEntregador;

	private final EditaEntregadorController controller;
	private final Entregador entregador;

	public EditaEntregador(Entregador entregador) {

		super("Informaçãoes Clientes");

		String notaCorreta;

		// controller = new CadastraClienteController(this);

		this.controller = new EditaEntregadorController(this);
		this.entregador = entregador;
		this.setSize(400, 600);
		this.setLayout(null);

		notaCorreta = entregador.getNota() + "";

		labelTela = new JLabel("Tela Edição Entregador");
		labelTela.setBounds(10, 0, 200, 50);

		labelNomeEntregador = new JLabel("Nome do entregador");
		labelNomeEntregador.setBounds(10, 50, 200, 50);

		nomeEntregador = new JTextField(entregador.getNome());
		nomeEntregador.setBounds(150, 60, 200, 30);

		labelEnderecoEntregador = new JLabel("Endereco do entregador");
		labelEnderecoEntregador.setBounds(10, 100, 200, 50);

		enderecoEntregador = new JTextField(entregador.getEndereco());
		enderecoEntregador.setBounds(150, 110, 200, 30);

		labelCpfEntregador = new JLabel("CPF do entregador");
		labelCpfEntregador.setBounds(10, 150, 200, 50);

		cpfEntregador = new JTextField(entregador.getCpf());
		cpfEntregador.setBounds(150, 160, 200, 30);

		labelModalidadeEntregador = new JLabel("Modalidade");
		labelModalidadeEntregador.setBounds(10, 200, 200, 50);

		modalidadeEntregador = new JTextField(entregador.getModalidade());
		modalidadeEntregador.setBounds(150, 210, 200, 30);

		labelNotaEntregador = new JLabel("Nota");
		labelNotaEntregador.setBounds(10, 250, 200, 50);

		notaEntregador = new JTextField(notaCorreta);
		notaEntregador.setBounds(150, 260, 200, 30);

//		SCATMAN'S WORLD
		labelContaEntregador = new JLabel("Dados da conta Bancaria do entregador");
		labelContaEntregador.setBounds(10, 300, 400, 50);

		labelBancoContaEntregador = new JLabel("Banco");
		labelBancoContaEntregador.setBounds(10, 350, 200, 50);

		bancoContaEntregador = new JTextField(entregador.getConta().getBanco());
		bancoContaEntregador.setBounds(150, 360, 200, 30);

		labelAgenciaContaEntregador = new JLabel("Agencia");
		labelAgenciaContaEntregador.setBounds(10, 400, 200, 50);

		agenciaContaEntregador = new JTextField(entregador.getConta().getAgencia() + "");
		agenciaContaEntregador.setBounds(150, 410, 200, 30);

		labelNumeroContaEntregador = new JLabel("Número da Conta");
		labelNumeroContaEntregador.setBounds(10, 450, 200, 50);

		numeroContaEntregador = new JTextField(entregador.getConta().getConta());
		numeroContaEntregador.setBounds(150, 460, 200, 30);

		botaoSalvarEntregador = new JButton("Salvar");
		botaoSalvarEntregador.setBounds(10, 500, 75, 50);
		botaoSalvarEntregador.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(100, 500, 100, 50);
		botaoCancelar.addActionListener(this);

		this.add(botaoSalvarEntregador);
		this.add(botaoCancelar);
		this.add(labelTela);
		this.add(labelNomeEntregador);
		this.add(labelEnderecoEntregador);
		this.add(labelCpfEntregador);
		this.add(labelModalidadeEntregador);
		this.add(labelNotaEntregador);
		this.add(labelContaEntregador);
		this.add(labelBancoContaEntregador);
		this.add(labelAgenciaContaEntregador);
		this.add(labelNumeroContaEntregador);

		this.add(nomeEntregador);
		this.add(enderecoEntregador);
		this.add(cpfEntregador);
		this.add(modalidadeEntregador);
		this.add(notaEntregador);
		this.add(bancoContaEntregador);
		this.add(agenciaContaEntregador);
		this.add(numeroContaEntregador);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.pressionarBotaoEntregador(e);

	}

	public JButton getBotaoSalvarEntregador() {
		return botaoSalvarEntregador;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public JLabel getLabelTela() {
		return labelTela;
	}

	public JLabel getLabelNomeEntregador() {
		return labelNomeEntregador;
	}

	public JLabel getLabelEnderecoEntregador() {
		return labelEnderecoEntregador;
	}

	public JLabel getLabelCpfEntregador() {
		return labelCpfEntregador;
	}

	public JLabel getLabelModalidadeEntregador() {
		return labelModalidadeEntregador;
	}

	public JLabel getLabelNotaEntregador() {
		return labelNotaEntregador;
	}

	public JLabel getLabelContaEntregador() {
		return labelContaEntregador;
	}

	public JLabel getLabelBancoContaEntregador() {
		return labelBancoContaEntregador;
	}

	public JLabel getLabelAgenciaContaEntregador() {
		return labelAgenciaContaEntregador;
	}

	public JLabel getLabelNumeroContaEntregador() {
		return labelNumeroContaEntregador;
	}

	public JTextField getNomeEntregador() {
		return nomeEntregador;
	}

	public JTextField getEnderecoEntregador() {
		return enderecoEntregador;
	}

	public JTextField getCpfEntregador() {
		return cpfEntregador;
	}

	public JTextField getModalidadeEntregador() {
		return modalidadeEntregador;
	}

	public JTextField getNotaEntregador() {
		return notaEntregador;
	}

	public JTextField getBancoContaEntregador() {
		return bancoContaEntregador;
	}

	public JTextField getAgenciaContaEntregador() {
		return agenciaContaEntregador;
	}

	public JTextField getNumeroContaEntregador() {
		return numeroContaEntregador;
	}

	public EditaEntregadorController getController() {
		return controller;
	}

	public Entregador getEntregador() {
		return entregador;
	}

}
