package controller;

import javax.swing.JOptionPane;

/**
 * Classe para a cria��o das mensagens de erro e sucesso qeu foram utilizadas em
 * diversas classes do projeto.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public class Mensagens {

	/**
	 * Exibe uma janela informando que o cadastro dos dados foi realizado com
	 * sucesso.
	 */
	public void mensagemSucessoCadastro() {

		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Exibe uma janela informando que o cadastro dos dados teve erro(s) na sua
	 * execu��o.
	 */

	public void mensagemErroCadastro() {

		JOptionPane.showMessageDialog(null,
				"Erro ao cadastrar os dados!\n " + "Por favor verifique os dados inserido e tente outra vez", null,
				JOptionPane.ERROR_MESSAGE);

	}

	/**
	 * Exibe uma janela informando que a edi��o de dados foi realizada com sucesso.
	 */

	public void mensagemSucessoEdicao() {

		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Exibe uma janela informando que a edi��o de dados teve erro(s) durante sua
	 * execu��o.
	 */

	public void mensagemErroEdicao() {

		JOptionPane.showMessageDialog(null,
				"Erro ao editar os dados!\n " + "Por favor verifique os dados inserido e tente outra vez", null,
				JOptionPane.ERROR_MESSAGE);

	}

}