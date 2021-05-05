package L7.ex6;

public class Empregado  extends Pessoa{ 
	private double salario;

	public Empregado(String nome, int idade, double altura, char sexo, double salario) {
		super(nome, idade, altura, sexo);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double obterLucros() {
		return this.getSalario();
	}
}
