package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//import model.Cliente;
import controller.ClienteController;

public class ClienteTela extends JFrame implements ActionListener, ListSelectionListener {

	private final JButton botaoCadastrarCliente;
	private final JButton botaoEditarCliente;
	private final JButton botaoExcluirCliente;
	private final JButton botaoVoltar;
	private final JLabel labelCliente;
	private JList<String> listaClientes;

	private final ClienteController controllerCliente;

	public ClienteTela() {

		super("Cliente");

		this.controllerCliente = new ClienteController(this);

		this.setSize(400, 600);
		this.setLayout(null);

		// Dados.getClientes().add(new Cliente("Fagner III", "Brasilia",
		// "025.951.753-46", "(61) 94545-6362"));
		// controllerCliente.gerarListaCliente().addElement(Dados.getClientes().get(0).getNome());
		listaClientes = new JList<String>();
		listaClientes.setModel(controllerCliente.gerarListaCliente());
		listaClientes.setBounds(10, 40, 350, 200);
		listaClientes.addListSelectionListener(this);

		labelCliente = new JLabel("Tela Clientes");
		labelCliente.setBounds(160, 0, 200, 50);

		botaoCadastrarCliente = new JButton("Cadastrar");
		botaoCadastrarCliente.setBounds(30, 500, 100, 50);
		botaoCadastrarCliente.addActionListener(this);

		botaoEditarCliente = new JButton("Editar");
		botaoEditarCliente.setBounds(100, 175, 200, 100);
		botaoEditarCliente.addActionListener(this);

		botaoExcluirCliente = new JButton("Excluir");
		botaoExcluirCliente.setBounds(100, 300, 200, 100);
		botaoExcluirCliente.addActionListener(this);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(250, 500, 100, 50);
		botaoVoltar.addActionListener(this);

		this.add(botaoCadastrarCliente);
		// this.add(botaoEditarCliente);
		// this.add(botaoExcluirCliente);
		this.add(labelCliente);
		this.add(botaoVoltar);
		this.add(listaClientes);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controllerCliente.pressionarBotaoCliente(e);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if (e.getValueIsAdjusting() && src == listaClientes) {

		}

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

	public JList<String> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(JList<String> listaClientes) {
		this.listaClientes = listaClientes;
	}

}