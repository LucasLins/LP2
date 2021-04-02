package model;

public class Produto {
	private String nome;
	private double valor;
	private int quantidadeEstoque;
	
	
	public Produto(String nome, double valor, int quantidadeEstoque) {
		this.nome = nome;
		this.valor = valor;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int i) {
		this.quantidadeEstoque -= i;
	}

}