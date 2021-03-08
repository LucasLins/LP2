/* 
Escreva um programa que receba o nome de um lutador e seu peso. Em seguida, informe a categoria a que pertence o lutador, conforme o Quadro abaixo 
(note que o quadro foi criado para efeito deste exerc�cio e n�o condiz com qualquer categoria de luta). 
A sa�da do programa deve exibir na tela uma frase com o padr�o descrito a seguir:
Nome fornecido: Pepe Jord�o
Peso fornecido: 73.4
>> O lutador Pepe Jord�o pesa 73.4 kg e se enquadra na categoria Ligeiro.
*/

package Questoes;

import java.util.Scanner;

public class Q02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Categoria do Lutador");
		
		System.out.println("\nDigite o nome do lutador:");
		String nome = input.nextLine();
		
		System.out.println("\nDigite o peso do lutador:");
		float peso = input.nextFloat();
		
		input.close();
		
		System.out.println("Nome fornecido: " +nome);
		System.out.println("Peso fornecido: " +peso);
		System.out.printf("O lutador %s pesa %.1f e se enquadra na categoria %s.", nome, peso, definircategoria(peso));
	}
	
	public static String definircategoria(float peso) {
		String categoria = "Peso inv�lido";
		
		if(peso < 65 && peso > 0) {
			categoria = "Pena";
		}
		else if(peso >= 65 && peso < 72) {
			categoria = "Leve";
		}
		else if(peso >= 72 && peso < 79) {
			categoria = "Ligeiro";
		}
		else if(peso >= 79 && peso < 86) {
			categoria = "Meio-m�dio";
		}
		else if(peso >= 86 && peso < 93) {
			categoria = "M�dio";
		}
		else if(peso >= 93 && peso < 100) {
			categoria = "Meio-pesado";
		}
		else if(peso >= 100) {
			categoria = "Pesado";
		}
		
		return categoria;
	}
}
