package view;

import javax.swing.JOptionPane;

import model.Lampada;

public class Questao3Teste {
	
	public static void main(String[] args) {
		
		boolean sair = false;
		
		Lampada l1 = new Lampada("Positivo", 10, 14.9, false);
		
		Object[] botoes = {"Status da Lâmpada", "Ligar", "Desligar", "Sair"};
		do {
			Object escolha = JOptionPane.showOptionDialog(null, l1.infoLampada()+"\n O que deseja fazer?", "Questão 3", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
			
			switch(escolha.toString()) {
				case "0":
					if(l1.estaLigada() == true) {
						JOptionPane.showMessageDialog(null, "A lâmpada está ligada");
					}
					else {
						JOptionPane.showMessageDialog(null, "A lâmpada está desligada");
					}
					break;
				case "1":
					l1.setLigada(true);
					JOptionPane.showMessageDialog(null, "Lâmpada ligada com sucesso");
					break;
				case "2":
					l1.setLigada(false);
					JOptionPane.showMessageDialog(null, "Lâmpada desligada com sucesso");
					break;
				case "3":
					JOptionPane.showMessageDialog(null, "Até mais!");
					sair = true;
					break;
			}
		}while(sair == false);

	}
}
