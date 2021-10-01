package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.FrangoController;

public class Frango extends JFrame implements ActionListener {

	private final JButton botaoCadastrarFrango;
	private final JButton botaoEditarFrango;
	private final JButton botaoExcluirFrango;
	private final JButton botaoVoltar;
	private final JLabel labelFrango;
	private final FrangoController controllerFrango;
	private JList<String> listaFrangos;

	public Frango() {

		super("Frango");

		this.controllerFrango = new FrangoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaFrangos = new JList<String>();
		listaFrangos.setModel(controllerFrango.gerarListaFrango());
		listaFrangos.setBounds(10, 40, 350, 200);

		labelFrango = new JLabel("Tela Frango");
		labelFrango.setBounds(160, 0, 200, 50);

		botaoCadastrarFrango = new JButton("Cadastrar");
		botaoCadastrarFrango.setBounds(30, 500, 100, 50);
		botaoCadastrarFrango.addActionListener(this);

		botaoEditarFrango = new JButton("Editar");
		botaoEditarFrango.setBounds(100, 175, 200, 100);
		botaoEditarFrango.addActionListener(this);

		botaoExcluirFrango = new JButton("Excluir");
		botaoExcluirFrango.setBounds(100, 300, 200, 100);
		botaoExcluirFrango.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarFrango);
		// this.add(botaoEditarFrango);
		// this.add(botaoExcluirFrango);
		this.add(labelFrango);
		this.add(botaoVoltar);
		this.add(listaFrangos);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerFrango.pressionarBotaoFrango(e);

	}

	public JButton getBotaoCadastrarFrango() {
		return botaoCadastrarFrango;
	}

	public JButton getBotaoEditarFrango() {
		return botaoEditarFrango;
	}

	public JButton getBotaoExcluirFrango() {
		return botaoExcluirFrango;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

}