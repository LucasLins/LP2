package model.Q04;

public class Aluno {
	private String nome;
	private String matricula;
	private double cre;
	private String curso;
	
	
	public Aluno(String nome, String matricula, double cre, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.cre = cre;
		this.curso = curso;
	}
	
	public String getNomeAluno() {
		return this.nome;
	}
	
	public double getCRE() {
		return this.cre;
	}
	
	public String toString() {
		return String.format("%nNome: %s%nMatrícula: %s%nCRE: %.1f%nCurso: %s%n", this.nome, this.matricula, this.cre, this.curso);
	}
}
	