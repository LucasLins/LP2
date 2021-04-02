package model;

public class Lampada {
	private String marca;
	private int voltagem;
	private double valor;
	private boolean ligada;
	
	public Lampada(String marca, int voltagem, double valor, boolean ligada) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.valor = valor;
		this.ligada = ligada;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public boolean estaLigada() {
		if(ligada == false) {
			return false;
		}
		else {
			return true;
		}
	}
		
	public String infoLampada() {
		return "Marca: "+this.marca+"\nVoltagem: "+this.voltagem+String.format("\nValor: %.2f R$", this.valor);
	}	
}
