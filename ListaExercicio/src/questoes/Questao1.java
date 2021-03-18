package questoes;

import javax.swing.JOptionPane;

public class Questao1 {
	String receberidade;
	int idade, idadedias;
	
	public void exibirq1() {
		receberidade = JOptionPane.showInputDialog(null, "Digite uma idade em anos:", "Questão 1: Converter anos para dias", JOptionPane.QUESTION_MESSAGE);
		if(receberidade != null) {
			idade = Integer.parseInt(receberidade);
			idadedias = idade * 365;
			JOptionPane.showMessageDialog(null, idade + " anos equivale a " + idadedias + " dias.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Até mais!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		
		
	}
}
