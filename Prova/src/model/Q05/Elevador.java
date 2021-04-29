package model.Q05;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeTotal;
	private int quantidadePessoas;
	
	public Elevador(int andarAtual, int totalAndares, int capacidadeTotal, int quantidadePessoas) {
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeTotal = capacidadeTotal;
		this.quantidadePessoas = quantidadePessoas;
	}
	
	public void inicializa(int capacidadeTotal, int totalAndares) {
		this.capacidadeTotal = capacidadeTotal;
		this.totalAndares = totalAndares;
	}
	
	public boolean entra() {
		if(this.quantidadePessoas < this.capacidadeTotal) {
			this.quantidadePessoas++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sai() {
		if(this.quantidadePessoas > 0) {
			this.quantidadePessoas--;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sobe() {
		if(this.andarAtual < this.totalAndares) {
			this.andarAtual++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean desce() {
		if(this.andarAtual > 0) {
			this.andarAtual--;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return String.format("Informações do Elevador:%nAndar atual: %d/%d%n Capacidade: %d/%d%n", andarAtual, totalAndares, quantidadePessoas, capacidadeTotal);
	}
}
