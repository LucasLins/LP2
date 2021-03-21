package questoes;

import javax.swing.JOptionPane;

public class Questao2 {

	String sbase, saltura;
	int base, altura;
	
	public void exibirq2() {
		sbase = JOptionPane.showInputDialog(null, "Digite o valor da base do ret�ngulo: (em cm)", "Quest�o 2: �rea do ret�ngulo", JOptionPane.QUESTION_MESSAGE);
		saltura = JOptionPane.showInputDialog(null, "Digite o valor da altura do ret�ngulo: (em cm)", "Quest�o 2: �rea do ret�ngulo", JOptionPane.QUESTION_MESSAGE);
		if(sbase == null || saltura == null) {
			JOptionPane.showMessageDialog(null, "Voc� precisa definir um valor para base e/ou altura!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		else {
			base = Integer.parseInt(sbase);
			altura = Integer.parseInt(saltura);
			JOptionPane.showMessageDialog(null, "A �rea de um ret�ngulo de base " + base + " cm e altura de " + altura + " cm �: " + base*altura + " cm", "Resposta", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
