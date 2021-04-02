package model;

import java.util.ArrayList;

public class Cliente {
	private String nomeCliente;
	private ArrayList<CestaItens> listaItens;
	private double valorPagar;
	private int totalItens;
	
	public Cliente(String nome, ArrayList<CestaItens> lista, double valorPagar, int totalItens) {
		this.nomeCliente = nome;
		this.listaItens = lista;
		this.valorPagar = valorPagar;
		this.totalItens = totalItens;
	}
	
	public void updateValores(int posicao) {
		int i = 0;
		for(i=posicao;i<listaItens.size();i++) {
			this.valorPagar += listaItens.get(i).getValor()*listaItens.get(i).getQuantidade();
			this.totalItens += listaItens.get(i).getQuantidade();
		}
	}
	
	public String getNome() {
		return this.nomeCliente;
	}
	
	public String infoListaItens() {
		int i=0;
		String info = "";
		for(i=0; i<listaItens.size();i++) {
			info += listaItens.get(i).getQuantidade()+" - "+listaItens.get(i).getNome()+"\n";
		}
		return info;
	}
	
	public double getValorPagar() {
		return this.valorPagar;
	}
	
	public int getTotalItens() {
		return this.totalItens;
	}
}
