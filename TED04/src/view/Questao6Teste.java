package view;

import javax.swing.JOptionPane;

import model.Data;

public class Questao6Teste {

	public static void main(String[] args) {
		
		boolean sair = false;
		
		
		Object[] botoes = {"Avan�ar dia", "Sair"};
		Data data = new Data(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia:")),Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o m�s:")), Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano:")));
		
		
		do {
			
			if(data.verificarData() == false) {
				JOptionPane.showMessageDialog(null, "A data fornecida � inv�lida!", "Erro", JOptionPane.ERROR_MESSAGE);
				sair = true;
			}
			else {
				System.out.println(sair);
				
				Object choice = JOptionPane.showOptionDialog(null, "Data: "+data.getData(), "Quest�o 6", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes[0]);
				if(choice.toString().equals("0")) {
					data.avancarDia();
				}
				else {
					JOptionPane.showMessageDialog(null, "At� mais!");
					sair = true;
				}
			}
		}while(sair == false);

	}

}
