package model.Q04;

public class Professor {
	private String nome;
	private String matricula;
	private String disciplina;
	private String coordenacao;
	
	public Professor(String nome, String matricula, String disciplina, String coordenacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.coordenacao = coordenacao;
	}

	public String toString() {
		return String.format("Nome: %s%nMatr�cula: %s%nDisciplina: %s%nCoordena��o: %s%n", this.nome, this.matricula, this.disciplina, this.coordenacao);
	}
	
	
}
