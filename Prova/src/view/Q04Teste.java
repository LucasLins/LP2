package view;

import javax.swing.JOptionPane;

import model.Q04.Aluno;
import model.Q04.Professor;
import model.Q04.Turma;

public class Q04Teste {

	public static void main(String[] args) {
		
		boolean sair = false;
		
		Aluno aluno1 = new Aluno("Lucas Lins", "202104A", 9.6, "Sistemas de Informação");
		Aluno aluno2 = new Aluno("Thalyson Rocha", "202106A", 9.1, "Sistemas de Informação");
		Aluno aluno3 = new Aluno("Liriel Terto", "202104A", 9.3, "Sistemas de Informação");
		
		Professor prof1 = new Professor("Alana Marques", "202101P", "Linguagem de Programação 2", "T.I");
		
		Turma turma1 = new Turma(aluno1, aluno2, aluno3, prof1);
		
		Object[] botoesMenu = {"Verificar Aluno", "Maior CRE", "Alunos Matriculados", "Sair"};
		
		do {
			Object escolha = JOptionPane.showOptionDialog(null, "Professor: \n"+prof1+"O que deseja fazer?", "Questão 4", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botoesMenu, botoesMenu);
			
			switch(escolha.toString()){
				case "0":
					if(turma1.verificarAluno(JOptionPane.showInputDialog(null, "Digite o nome do aluno:", "Verificar Aluno", JOptionPane.QUESTION_MESSAGE))) {
						JOptionPane.showMessageDialog(null, "O aluno está matriculado nesta turma!", "Verificar Aluno", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "O aluno não está matriculado nesta turma!", "Verificar Aluno", JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "1":
					JOptionPane.showMessageDialog(null, String.format("O maior CRE da turma é %.1f", turma1.maiorCRE()), "Maior CRE", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "2":
					JOptionPane.showMessageDialog(null, turma1.imprimeAlunosMatriculados());
					break;
					
				case "3":
					JOptionPane.showMessageDialog(null, "Até mais!", "Saindo do programa", JOptionPane.PLAIN_MESSAGE);
					sair = true;
					break;
					
				default:
					sair = true;
					break;
					
			}
		}while(!sair);
		
		
		
		
	}

}
