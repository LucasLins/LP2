package model;

public class Emprestimo {
	private Livro livro;
	private Pessoa pessoa;
	private String dataEmp;
	private String dataEntrega;

	public Emprestimo(Livro lv, Pessoa ps, String dataEmp, String dataEnt) {
		this.livro = lv;
		this.pessoa = ps;
		this.dataEmp = dataEmp;
		this.dataEntrega = dataEnt;
	}
	
	public String getInfo() {
		return String.format("Livro: %s\nAutor: %s\nNúmero de Páginas: %d\nAlugado por: %s\nData emprestimo: %s\nData entrega: %s\n", this.livro.getNome(), this.livro.getAutor(), this.livro.getNpaginas(), this.pessoa.getNome(), this.dataEmp, this.dataEntrega);
	}
}
