package model;

public class Moldura {
	
	public float base, altura, espessura;
	
	public Moldura(float b, float h, float e) {
		this.base = b;
		this.altura = h;
		this.espessura = e;
	}
	
	public float calcularAreaMoldura() {
		return (this.base * this.altura) - ((this.base - (this.espessura*2)) * (this.altura - (this.espessura*2)));
	}
}
