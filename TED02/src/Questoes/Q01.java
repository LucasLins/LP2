/* 1. Escreva um programa que receba tr�s n�meros reais e informe se eles constituem os lados de um tri�ngulo. 
 * Em caso afirmativo, informe se o tri�ngulo � equil�tero, is�sceles ou escaleno. Para que tr�s n�meros formem um tri�ngulo, a soma dos dois lados menores deve ser maior que o lado maior. 
 * Uma boa solu��o para esse problema envolve o uso dos operadores && e ||.
*/

package Questoes;

import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tipos de Tri�ngulo");
		
		System.out.println("\nDigite o primeiro n�mero real:");
		float numero1 = input.nextFloat();
		
		System.out.println("\nDigite o segundo n�mero real:");
		float numero2 = input.nextFloat();
		
		System.out.println("\nDigite o terceiro n�mero real:");
		float numero3 = input.nextFloat();
		
		input.close();
		verificartriangulo(numero1, numero2, numero3);
	}
	
	public static void verificartriangulo(float n1, float n2, float n3) {
		if(((n1 > n2 && n1 > n3) && ((n2+n3) < n1)) || ((n2 > n1 && n2 > n3) && ((n1+n3) < n2)) || ((n3 > n1 && n3 > n2) && ((n1+n2) < n3))){
			System.out.println("\nN�o � um tri�ngulo!");
		}
		else if(n1 != n2 && n1 != n3 && n2 != n3) {
			System.out.println("\n� um tri�ngulo Escaleno!");
		}
		else if(n1 == n2 && n1 == n3 && n2 == n3) {
			System.out.println("\n� um tri�ngulo Equilatero!");
		}
		else if((n1 == n2 && n1 != n3) || (n2 == n3 && n2 != n1) || (n3 == n1 && n3 != n2)) {
			System.out.println("\n� um tri�ngulo Is�sceles!");
		}
		
	}

}
