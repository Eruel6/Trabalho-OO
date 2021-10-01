package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.EntregadorController;

public class EntregadorTela extends JFrame implements ActionListener {

	private final JButton botaoCadastrarEntregador;
	private final JButton botaoEditarEntregador;
	private final JButton botaoExcluirEntregador;
	private final JButton botaoVoltar;
	private final JLabel labelEntregador;
	private JList<String> listaEntregadores;

	private final EntregadorController controllerEntregador;

	public EntregadorTela() {

		super("Entregador");

		this.controllerEntregador = new EntregadorController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaEntregadores = new JList<String>();
		listaEntregadores.setModel(controllerEntregador.gerarListaEntregadores());
		listaEntregadores.setBounds(10, 40, 350, 200);

		labelEntregador = new JLabel("Tela Entregadores");
		labelEntregador.setBounds(160, 0, 200, 50);

		botaoCadastrarEntregador = new JButton("Cadastrar");
		botaoCadastrarEntregador.setBounds(30, 500, 100, 50);
		botaoCadastrarEntregador.addActionListener(this);

		botaoEditarEntregador = new JButton("Editar");
		botaoEditarEntregador.setBounds(100, 175, 200, 100);
		botaoEditarEntregador.addActionListener(this);

		botaoExcluirEntregador = new JButton("Excluir");
		botaoExcluirEntregador.setBounds(100, 300, 200, 100);
		botaoExcluirEntregador.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarEntregador);
		// this.add(botaoEditarEntregador);
		// this.add(botaoExcluirEntregador);
		this.add(labelEntregador);
		this.add(botaoVoltar);
		this.add(listaEntregadores);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerEntregador.pressionarBotaoEntregador(e);

	}

	public JButton getBotaoCadastrarEntragador() {
		return botaoCadastrarEntregador;
	}

	public JButton getBotaoEditarEntregador() {
		return botaoEditarEntregador;
	}

	public JButton getBotaoExcluirEntregador() {
		return botaoExcluirEntregador;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

}
