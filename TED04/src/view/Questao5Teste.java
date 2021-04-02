package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Emprestimo;
import model.Livro;
import model.Pessoa;

public class Questao5Teste {

	public static void main(String[] args) {
		Livro l1 = new Livro("Código Limpo", "Robert Cecil Martin", 457);
		Livro l2 = new Livro("Arquitetura Limpa", "Robert Cecil Martin", 423);
		
		Pessoa p1 = new Pessoa("Lucas", "(83)99857-4412");
		Pessoa p2 = new Pessoa("Alana", "(83)98902-6901");
		
		ArrayList<Emprestimo> listaEmprestimos = new ArrayList();
		
		listaEmprestimos.add(0, new Emprestimo(l1, p2, "01/04/2021", "01/05/2021"));
		listaEmprestimos.add(1, new Emprestimo(l2, p1, "09/04/2021", "09/05/2021"));
		
		String exibirEmprestimos = "";
		for(int i=0; i < listaEmprestimos.size(); i++) {
			exibirEmprestimos += listaEmprestimos.get(i).getInfo();
			exibirEmprestimos += "_______________________\n";
		}
		
		JOptionPane.showMessageDialog(null, "Lista de Emprestimos:\n"+exibirEmprestimos, "Questão 5", JOptionPane.INFORMATION_MESSAGE);
	}

}
