package questoes;

import javax.swing.JOptionPane;

public class Questao2 {

	String sbase, saltura;
	int base, altura;
	
	public void exibirq2() {
		sbase = JOptionPane.showInputDialog(null, "Digite o valor da base do retângulo: (em cm)", "Questão 2: Área do retângulo", JOptionPane.QUESTION_MESSAGE);
		saltura = JOptionPane.showInputDialog(null, "Digite o valor da altura do retângulo: (em cm)", "Questão 2: Área do retângulo", JOptionPane.QUESTION_MESSAGE);
		if(sbase == null || saltura == null) {
			JOptionPane.showMessageDialog(null, "Você precisa definir um valor para base e/ou altura!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		else {
			base = Integer.parseInt(sbase);
			altura = Integer.parseInt(saltura);
			JOptionPane.showMessageDialog(null, "A área de um retângulo de base " + base + " cm e altura de " + altura + " cm é: " + base*altura + " cm", "Resposta", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
