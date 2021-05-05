package L7.ex3;

public class Calculadora {
	
	private double valor1;
	private double valor2;
	private char operacao;
	private CalculadorOperacoes calculadorOperacoes;
	
	
	
	public Calculadora(double valor1, double valor2, char operacao) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.operacao = operacao;
		this.calculadorOperacoes = new CalculadorOperacoes();
	}

	
	
	public double getValor1() {
		return valor1;
	}



	public double getValor2() {
		return valor2;
	}



	public char getOperacao() {
		return operacao;
	}



	public double calcular() {
		return this.calculadorOperacoes.calcula(this);
	}
}
