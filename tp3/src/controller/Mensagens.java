package controller;

import javax.swing.JOptionPane;

public class Mensagens {

	public void mensagemSucessoCadastro() {

		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);

	}

	public void mensagemErroCadastro() {

		JOptionPane.showMessageDialog(null,
				"Erro ao cadastrar os dados!\n " + "Por favor verifique os dados inserido e tente outra vez", null,
				JOptionPane.ERROR_MESSAGE);

	}

}