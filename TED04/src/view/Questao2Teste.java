package view;

import javax.swing.JOptionPane;

import model.Funcionario;

public class Questao2Teste {

	public static void main(String[] args) {
		
		boolean sair = false;
		Funcionario f1 = new Funcionario("Lucas Lins", "T.I", 1120.90, "30/03/2021", "3.495.132");
		
		Object[] botoes = {"Aumentar salário", "Exibir salário anual", "Sair"};
		do {
			Object escolha = JOptionPane.showOptionDialog(null, "Dados do funcionário \n"+f1.infoFuncionario(), "Questão 2", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
		
			switch(escolha.toString()) {
				case "0":
					f1.recebeAumento(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a porcentagem do aumento:", "Aumentar salário", JOptionPane.QUESTION_MESSAGE)));
					JOptionPane.showMessageDialog(null, String.format("O salário foi aumentado para %.2f R$",f1.getSalario()));
					break;
				
				case "1":
					JOptionPane.showMessageDialog(null, String.format("O salário anual do funcionário é: %.2f R$",f1.recebeAnual()), "Salário anual", JOptionPane.INFORMATION_MESSAGE);
					break;
				
				case "2":
					JOptionPane.showMessageDialog(null, "Até mais!", "Questão 1", JOptionPane.PLAIN_MESSAGE);
					sair = true;
					break;
			}
		}while(sair == false);
	}

}
