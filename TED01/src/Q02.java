/*
Quest�o 2: Uma escada encostada diretamente contra uma parede cair� a menos que colocada em um certo �ngulo menor que 90 graus.
Dadas as vari�veis comprimento e �ngulo armazenando o comprimento da escada e o �ngulo que ela forma com o solo enquanto
encostada na parede, escreva uma express�o Java envolvendo comprimento e �ngulo, que calcule a altura alcan�ada pela escada.
Avalie a express�o para estes valores de comprimento e �ngulo: 

(a) 16 p�s e 75 graus 
(b) 20 p�s e 0 graus 
(c) 24 p�s e 45 graus 
(d) 24 p�s e 80 graus 
 */

public class Q02 {
	
	public static void main(String args[]) {
		
		System.out.printf("A) %.2f p�s %n",calcularaltura(16, 75));
		System.out.printf("B) %.2f p�s %n",calcularaltura(20, 0));
		System.out.printf("C) %.2f p�s %n",calcularaltura(24, 45));
		System.out.printf("D) %.2f p�s %n",calcularaltura(24, 80));
	}
	
	public static double calcularaltura(float comprimento, int angulo) {
		double altura = Math.sin(Math.toRadians(angulo)) * comprimento;
		return altura;
	}
}
