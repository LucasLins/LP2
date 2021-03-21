package view;

import model.Moldura;
import javax.swing.JOptionPane;

public class Ted03App {

	public static void main(String[] args) {
		
		float base, altura, espessura;
		int done = 0;
		
		Object[] menu = {"Calcular �rea", "Sair"};
		
		do {
			Object escolha = JOptionPane.showOptionDialog(null, "Calculadora de �rea da moldura\n O que deseja fazer?", "TED03", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
			
			switch(escolha.toString()) {
				case "0":
					try {
						base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base da moldura em cm: ", "Calcular �rea da moldura", JOptionPane.QUESTION_MESSAGE));
						altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura da moldura em cm: ", "Calcular �rea da moldura", JOptionPane.QUESTION_MESSAGE));
						espessura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a espessura da moldura em cm: ", "Calcular �rea da moldura", JOptionPane.QUESTION_MESSAGE));
						Moldura m1 = new Moldura(base, altura, espessura);
						JOptionPane.showMessageDialog(null, "A �rea da moldura �: " + m1.calcularAreaMoldura() + " cm�", "Resultado", JOptionPane.INFORMATION_MESSAGE);
						m1 = null;
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(null, "N�o foi poss�vel calcular a �rea pois n�o foi informado todos os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "1":
					JOptionPane.showMessageDialog(null, "At� mais!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
					done = 1;
					break;
			}
		
		}while(done == 0);
	}

}