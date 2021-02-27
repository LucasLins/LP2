/*
Questão 2: Uma escada encostada diretamente contra uma parede cairá a menos que colocada em um certo ângulo menor que 90 graus.
Dadas as variáveis comprimento e ângulo armazenando o comprimento da escada e o ângulo que ela forma com o solo enquanto
encostada na parede, escreva uma expressão Java envolvendo comprimento e ângulo, que calcule a altura alcançada pela escada.
Avalie a expressão para estes valores de comprimento e ângulo: 

(a) 16 pés e 75 graus 
(b) 20 pés e 0 graus 
(c) 24 pés e 45 graus 
(d) 24 pés e 80 graus 
 */

public class Q02 {
	
	public static void main(String args[]) {
		
		System.out.printf("A) %.2f pés %n",calcularaltura(16, 75));
		System.out.printf("B) %.2f pés %n",calcularaltura(20, 0));
		System.out.printf("C) %.2f pés %n",calcularaltura(24, 45));
		System.out.printf("D) %.2f pés %n",calcularaltura(24, 80));
	}
	
	public static double calcularaltura(float comprimento, int angulo) {
		double altura = Math.sin(Math.toRadians(angulo)) * comprimento;
		return altura;
	}
}
