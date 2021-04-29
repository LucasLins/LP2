package view;

import javax.swing.JOptionPane;

import model.Q05.Elevador;

public class Q05Teste {

	public static void main(String[] args) {
		boolean sair = false;
		
		Elevador elevador = new Elevador(0, 0, 0, 0);
		
		Object[] botoesMenu = {"Adicionar pessoa", "Remover pessoa", "Subir", "Descer", "Sair"};
		
		elevador.inicializa(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a capacidade total do elevador:", "Inicializar elevador" , JOptionPane.QUESTION_MESSAGE)), 
							Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o total de andares do pr�dio:", "Inicializar elevador" , JOptionPane.QUESTION_MESSAGE)));
		
		do {
			Object escolha = JOptionPane.showOptionDialog(null, elevador+"O que deseja fazer?", "Quest�o 5", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoesMenu, botoesMenu);
			
			switch(escolha.toString()) {
				case "0":
					if(elevador.entra()) {
						JOptionPane.showMessageDialog(null, "A pessoa entrou no elevador.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "O elevador est� lotado!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "1":
					if(elevador.sai()) {
						JOptionPane.showMessageDialog(null, "A pessoa saiu do elevador.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "O elevador est� vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "2":
					if(elevador.sobe()) {
						JOptionPane.showMessageDialog(null, "O elevador subiu um andar.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "O elevador j� est� no �ltimo andar!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "3":
					if(elevador.desce()) {
						JOptionPane.showMessageDialog(null, "O elevador desceu um andar.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "O elevador j� est� no t�rreo!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "4":
					JOptionPane.showMessageDialog(null, "At� mais!", "Saindo do programa", JOptionPane.PLAIN_MESSAGE);
					sair = true;
					break;
					
				default:
					sair = true;
					break;
				
			}
		}while(!sair);
	}

}
