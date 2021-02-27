/*
 Questão 1: A gravidade da Lua é cerca de 17% a da Terra. Crie um programa que calcule seu peso na Lua.
 */

public class Q01 {
	public static void main(String args[]) {
		float peso = 80f;
		
		System.out.println("Meu peso na lua é: "+calcularpesolua(peso));
	}
	
	public static float calcularpesolua(float peso) {
		float pesolua = peso * 0.17f;
		
		return pesolua;
	}
}
