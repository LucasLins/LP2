package model;

public class Cachorro {
	private String nome;
	private String raca;
	private String sexo;
	private int idade;
	private int energia = 100;
	private int numeroFilhotes = 0;
	
	public Cachorro(String nome, String raca, String sexo, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getNumeroFilhotes() {
		return numeroFilhotes;
	}

	public void setNumeroFilhotes(int numeroFilhotes) {
		this.numeroFilhotes = numeroFilhotes;
	}
	
	public String toString() {
		return String.format("Nome: %s%nRaça: %s%nSexo: %s%nIdade: %d%nEnergia: %d%nNúmero de filhotes: %s%n", this.nome, this.raca, this.sexo, this.idade, this.energia, this.numeroFilhotes);
	}
	
	public int comer(String comida) {
		if(comida.equals("Ração")) {
			this.energia += 50;
		}
		else if(comida.equals("Carne")) {
			this.energia += 40;
		}
		else if(comida.equals("Legumes")) {
			this.energia += 30;
		}
		
		return this.energia;
	}
	
	public int brincar(String brincadeira) {
		if(brincadeira.equals("Bolinha")) {
			this.energia -= 30;
		}
		else if(brincadeira.equals("Saltar")) {
			this.energia -= 20;
		}
		else if(brincadeira.equals("Girar")) {
			this.energia -= 10;
		}
		
		return this.energia;
	}
	
	public boolean podeCruzar(Cachorro parceiro) {
		if(this.idade > 0 && this.idade <= 9 && parceiro.getIdade() > 0 && parceiro.getIdade() <= 9
				&& parceiro.getRaca().equalsIgnoreCase(this.raca)
				&& this.energia > 80 && parceiro.getEnergia() > 80
				&& !parceiro.getSexo().equalsIgnoreCase(this.sexo)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int cruzar(Cachorro parceiro) {
		this.energia -= 50;
		parceiro.setEnergia(parceiro.getEnergia()-50);
		int nrandom = (int)Math.floor(Math.random()*(9-1+1)+1);
		this.numeroFilhotes += (int)nrandom;
		parceiro.setNumeroFilhotes(parceiro.getNumeroFilhotes()+(int)nrandom);
		return (int)nrandom;
	}

}
