package questoes;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Menu {
	
	public static void main(String[] args) {
		
		Questao1 q01;
		Questao2 q02;
		
		q01 = new Questao1();
		q02 = new Questao2();
		
		int choice = 0;
		do {
			UIManager.put("OptionPane.cancelButtonText", "SAIR");
			Object[] opcoesquestoes = {"Quest�o 1", "Quest�o 2", "Quest�o 3"};
			Object selectedvalue = JOptionPane.showInputDialog(null, "Qual quest�o deseja visualizar?", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoesquestoes, opcoesquestoes[0]);
			if(selectedvalue == null) {
				selectedvalue = "Sair";
			}
			
			switch(selectedvalue.toString()){
				case "Sair":
					JOptionPane.showMessageDialog(null, "At� mais!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					choice = 0;
					break;
				
				case "Quest�o 1":
					q01.exibirq1();
					break;
					
				case "Quest�o 2":
					q02.exibirq2();
					break;
					
				case "null":
					JOptionPane.showMessageDialog(null, "At� mais!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					break;
					
			}
		
		
		}while(choice != 0);

	}
}