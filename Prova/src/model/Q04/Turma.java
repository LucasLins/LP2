package model.Q04;

public class Turma {

	Aluno al1, al2, al3;
	Professor prof;
	
	public Turma(Aluno al1, Aluno al2, Aluno al3, Professor prof) {
		this.al1 = al1;
		this.al2 = al2;
		this.al3 = al3;
		this.prof = prof;
	}
	
	public boolean verificarAluno(String nome) {
		boolean resultado;
		if(nome.equalsIgnoreCase(al1.getNomeAluno()) || nome.equalsIgnoreCase(al2.getNomeAluno()) || nome.equalsIgnoreCase(al3.getNomeAluno())) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
	 public double maiorCRE() {
		 double cre = 0;
		 
		 if(al1.getCRE() > al2.getCRE() && al1.getCRE() > al3.getCRE()) {
			 cre = al1.getCRE();
		 }
		 else if(al2.getCRE() > al1.getCRE() && al2.getCRE() > al3.getCRE()) {
			 cre = al2.getCRE();
		 }
		 else if(al3.getCRE() > al1.getCRE() && al3.getCRE() > al2.getCRE()) {
			 cre = al3.getCRE();
		 }
		 return cre;
	 }
	 
	 public String imprimeAlunosMatriculados() {
		 return "Alunos Matriculados:\n"+this.al1+this.al2+this.al3;
	 }
	
	
}
