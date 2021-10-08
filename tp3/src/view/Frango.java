package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.FrangoController;
import model.Pedido;

/**
 * Parametros da tela de frango, onde será dada a opção do usuário realizar o
 * CRUD de frango.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Frango extends JFrame implements ActionListener {

	private final JButton botaoCadastrarFrango;
	private final JButton botaoEditarFrango;
	private final JButton botaoExcluirFrango;
	private final JButton botaoVoltar;
	private final JLabel labelFrango;
	private final FrangoController controllerFrango;
	private final JList<String> listaFrangos;
	private final Pedido pedido;

	/**
	 * Construtor da tela de frango
	 * 
	 * @param pedido
	 */

	public Frango(Pedido pedido) {

		super("Frango");

		this.pedido = pedido;
		this.controllerFrango = new FrangoController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaFrangos = new JList<>();
		listaFrangos.setModel(controllerFrango.gerarListaFrango());
		listaFrangos.setBounds(10, 40, 350, 200);

		labelFrango = new JLabel("Tela Frango");
		labelFrango.setBounds(160, 0, 200, 50);

		botaoCadastrarFrango = new JButton("Cadastrar");
		botaoCadastrarFrango.setBounds(30, 270, 100, 60);
		botaoCadastrarFrango.addActionListener(this);

		botaoEditarFrango = new JButton("Editar");
		botaoEditarFrango.setBounds(30, 360, 100, 60);
		botaoEditarFrango.addActionListener(this);

		botaoExcluirFrango = new JButton("Excluir");
		botaoExcluirFrango.setBounds(30, 450, 100, 60);
		botaoExcluirFrango.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarFrango);
		this.add(botaoEditarFrango);
		this.add(botaoExcluirFrango);
		this.add(labelFrango);
		this.add(botaoVoltar);
		this.add(listaFrangos);

		setVisible(true);
	}

	/**
	 * Listener para a tela de frango
	 */

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

	public JList<String> getListaFrangos() {
		return listaFrangos;
	}

	public JLabel getLabelFrango() {
		return labelFrango;
	}

	public FrangoController getControllerFrango() {
		return controllerFrango;
	}

	public Pedido getPedido() {
		return pedido;
	}

}
