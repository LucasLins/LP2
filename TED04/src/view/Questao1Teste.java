package view;

import javax.swing.JOptionPane;

import model.Aluno;

public class Questao1Teste {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Lucas Lins", "53001", "Rua João oliveira", "331.123.443-8");
		Aluno aluno2 = new Aluno("Thalyson Rocha", "55009", "Rua Projetada", "121.313.933-1");
		Aluno aluno3 = new Aluno("Alana Marques", "52157", "Rua André Dias", "091.173.662-3");
		
		Object[] listaAlunos = new String[3];
		listaAlunos[0] = aluno1.getNome();
		listaAlunos[1] = aluno2.getNome();
		listaAlunos[2] = aluno3.getNome();
		
		Object escolha = JOptionPane.showInputDialog(null, "Qual aluno deseja visualizar?", "Questão 1", JOptionPane.QUESTION_MESSAGE, null, listaAlunos, listaAlunos[0]);

		if(escolha == null) {
			JOptionPane.showMessageDialog(null, "Até mais!");
		}
		else if (escolha.equals(aluno1.getNome())){
			JOptionPane.showMessageDialog(null, aluno1.infoAlunos(), "Informações do Aluno", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(escolha.equals(aluno2.getNome())){
			JOptionPane.showMessageDialog(null, aluno2.infoAlunos(), "Informações do Aluno", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(escolha.equals(aluno3.getNome())){
			JOptionPane.showMessageDialog(null, aluno3.infoAlunos(), "Informações do Aluno", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
