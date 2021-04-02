package model;

public class Aluno {
	private String nome; 
	private String matricula; 
	private String endereco; 
	private String cpf;
	
	public Aluno(String n, String m, String e, String c) {
		this.nome = n;
		this.matricula = m;
		this.endereco = e;
		this.cpf = c;
	}
	
	public String infoAlunos() {
		return "Nome: "+this.nome+"\nMatrícula: "+this.matricula+"\nEndereço: "+this.endereco+"\nCPF: "+this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
}
