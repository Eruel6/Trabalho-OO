package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

//import model.Cliente;
import controller.ClienteController;

public class ClienteTela extends JFrame implements ActionListener {

	private final JButton botaoCadastrarCliente;
	private final JButton botaoEditarCliente;
	private final JButton botaoExcluirCliente;
	private final JButton botaoVoltar;
	private final JButton botaoPedido;
	private final JLabel labelCliente;
	private final JList<String> listaClientes;

	private final ClienteController controllerCliente;

	public ClienteTela() {

		super("Cliente");

		this.controllerCliente = new ClienteController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		listaClientes = new JList<>();
		listaClientes.setModel(controllerCliente.gerarListaCliente());
		listaClientes.setBounds(10, 40, 350, 200);

		labelCliente = new JLabel("Tela Clientes");
		labelCliente.setBounds(160, 0, 200, 50);

		botaoPedido = new JButton("Pedido");
		botaoPedido.setBounds(250, 360, 100, 60);
		botaoPedido.addActionListener(this);

		botaoCadastrarCliente = new JButton("Cadastrar");
		botaoCadastrarCliente.setBounds(30, 270, 100, 60);
		botaoCadastrarCliente.addActionListener(this);

		botaoEditarCliente = new JButton("Editar");
		botaoEditarCliente.setBounds(30, 360, 100, 60);
		botaoEditarCliente.addActionListener(this);

		botaoExcluirCliente = new JButton("Excluir");
		botaoExcluirCliente.setBounds(30, 450, 100, 60);
		botaoExcluirCliente.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarCliente);
		this.add(botaoEditarCliente);
		this.add(botaoExcluirCliente);
		this.add(labelCliente);
		this.add(botaoVoltar);
		this.add(listaClientes);
		this.add(botaoPedido);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerCliente.pressionarBotaoCliente(e);

	}

	public JButton getBotaoCadastrarCliente() {
		return botaoCadastrarCliente;
	}

	public JButton getBotaoEditarCliente() {
		return botaoEditarCliente;
	}

	public JButton getBotaoExcluirCliente() {
		return botaoExcluirCliente;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JButton getBotaoPedido() {
		return botaoPedido;
	}

	public JList<String> getListaClientes() {
		return listaClientes;
	}

	public JLabel getLabelCliente() {
		return labelCliente;
	}

	public ClienteController getControllerCliente() {
		return controllerCliente;
	}

}