package model;

public class Livro {
	
	private String nomeLivro;
	private String autor;
	private int nPaginas;
	
	public Livro(String nLivro, String autor, int nPaginas) {
		this.nomeLivro = nLivro;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}
	
	public String getNome() {
		return this.nomeLivro;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getNpaginas() {
		return this.nPaginas;
	}
}
