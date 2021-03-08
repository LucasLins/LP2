/* 1. Escreva um programa que receba três números reais e informe se eles constituem os lados de um triângulo. 
 * Em caso afirmativo, informe se o triângulo é equilátero, isósceles ou escaleno. Para que três números formem um triângulo, a soma dos dois lados menores deve ser maior que o lado maior. 
 * Uma boa solução para esse problema envolve o uso dos operadores && e ||.
*/

package Questoes;

import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tipos de Triângulo");
		
		System.out.println("\nDigite o primeiro número real:");
		float numero1 = input.nextFloat();
		
		System.out.println("\nDigite o segundo número real:");
		float numero2 = input.nextFloat();
		
		System.out.println("\nDigite o terceiro número real:");
		float numero3 = input.nextFloat();
		
		input.close();
		verificartriangulo(numero1, numero2, numero3);
	}
	
	public static void verificartriangulo(float n1, float n2, float n3) {
		if(((n1 > n2 && n1 > n3) && ((n2+n3) < n1)) || ((n2 > n1 && n2 > n3) && ((n1+n3) < n2)) || ((n3 > n1 && n3 > n2) && ((n1+n2) < n3))){
			System.out.println("\nNão é um triângulo!");
		}
		else if(n1 != n2 && n1 != n3 && n2 != n3) {
			System.out.println("\nÉ um triângulo Escaleno!");
		}
		else if(n1 == n2 && n1 == n3 && n2 == n3) {
			System.out.println("\nÉ um triângulo Equilatero!");
		}
		else if((n1 == n2 && n1 != n3) || (n2 == n3 && n2 != n1) || (n3 == n1 && n3 != n2)) {
			System.out.println("\nÉ um triângulo Isósceles!");
		}
		
	}

}
