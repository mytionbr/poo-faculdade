package L7.ex3;

public class CalculadorOperacoes {

	public double calcula(Calculadora calculadora) {
		
		Operacao soma = new OperacaoSoma();
		Operacao multiplicacao = new OperacaoMultiplicacao();
		Operacao divicao = new OperacaoDivisao();
		Operacao subtracao = new OperacaoSubtracao();
		Operacao semOperacao = new SemOperacao();
		
		
		soma.setProximo(multiplicacao);
		multiplicacao.setProximo(divicao);
		divicao.setProximo(subtracao);
		subtracao.setProximo(semOperacao);
				
		return soma.calcula(calculadora);
	}

}
