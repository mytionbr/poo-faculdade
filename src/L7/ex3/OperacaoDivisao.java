package L7.ex3;

public class OperacaoDivisao implements Operacao{
	
	private Operacao proximo;

	@Override
	public double calcula(Calculadora calculadora) {
		if(calculadora.getValor1() <= 0 || calculadora.getValor2() <= 0)
			throw new NullPointerException("Erro: Divisão por zero");
		if(calculadora.getOperacao() == '/')
			return (calculadora.getValor1() / calculadora.getValor2());
		else 
			return this.proximo.calcula(calculadora);
	}

	@Override
	public void setProximo(Operacao operacao) {
		
		this.proximo = operacao;
		
	}



}
