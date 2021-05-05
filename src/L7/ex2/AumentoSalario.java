package L7.ex2;

public class AumentoSalario {
	
	public void calculaAumento (Empregado empregado, double percentualAumento) {
		empregado.setSalarioMensal( empregado.getSalarioMensal() + (empregado.getSalarioMensal() * covertePorcentagem(percentualAumento)));
	}
	
	private double covertePorcentagem(double porcentagem) {
		return porcentagem / 100;
	}
	

}

