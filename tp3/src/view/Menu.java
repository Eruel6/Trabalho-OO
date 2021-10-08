package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import controller.MenuController;

/**
 * Parametros da tela de menu, onde será dada a opção do usuário navegar para a
 * tela de cliente ou de entregadores para começar a utilização do programa.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Menu extends JFrame implements ActionListener {

	private final JButton botaoCliente;
	private final JButton botaoEntregador;
	private final JLabel menuLabel;
	private final MenuController controller;

	/**
	 * Construtor da tela de menu.
	 */

	public Menu() {

		super("Menu");
		this.controller = new MenuController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		menuLabel = new JLabel("BEM VINDO !");
		menuLabel.setBounds(160, 0, 200, 50);

		botaoCliente = new JButton("Cliente");
		botaoCliente.setBounds(100, 75, 200, 150);
		botaoCliente.addActionListener(this);

		botaoEntregador = new JButton("Entregador");
		botaoEntregador.setBounds(100, 300, 200, 150);
		botaoEntregador.addActionListener(this);

		this.add(botaoCliente);
		this.add(botaoEntregador);
		this.add(menuLabel);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	/**
	 * Listener da tela de menu.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.pressionarBotao(e);

	}

	public JButton getBotaoCliente() {
		return botaoCliente;
	}

	public JButton getBotaoEntregador() {
		return botaoEntregador;
	}

	public MenuController getController() {
		return controller;
	}

}