package L7.ex2;

import L7.ex1.RegrasNegocio;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioMensal;

	
	public Empregado(String nome, String sobrenome, double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
		
		verificaValor();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public void verificaValor() {
		if(this.getSalarioMensal() < 0) {
			this.setSalarioMensal(0);
		}
	}
}
