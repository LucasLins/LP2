package model;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String data;
	private String rg;
	
	public Funcionario(String nome, String departamento, double salario, String data, String rg) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.data = data;
		this.rg = rg;
	}
	
	public String infoFuncionario() {
		return "Nome: "+this.nome+"\nDepartamento: "+this.departamento+String.format("\nSalário: %.2f R$", this.salario)+"\nData: "+this.data+"\nRG: "+this.rg;
	}
	
	public void recebeAumento(double porcentagem) {
		this.salario = this.salario * ((porcentagem + 100)/100);
	}
	
	public double recebeAnual() {
		return this.salario*12;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String getNome() {
		return this.nome;
	}
}
