package model;

public class CestaItens {
	private Produto item;
	private int quantidade;
	
	
	public CestaItens(Produto item, int quantidade) {
		this.item = item;
		this.quantidade = quantidade;
	}

	public double getValor() {
		return item.getValor();
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public String getNome() {
		return this.item.getNome();
	}
}
