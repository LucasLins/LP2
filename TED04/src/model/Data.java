package model;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	public boolean verificarData() {
		if(this.dia > 0 && this.dia <=31 && this.mes > 0 && this.mes <= 12 && this.ano > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getData() {
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
	}
	
	public void avancarDia() {
		this.dia += 1;
		if(this.dia > 31) {
			this.dia = 1;
			this.mes += 1;
			if(this.mes > 12) {
				this.mes = 1;
				this.ano += 1;
			}
		}
	}
}
