package L7.ex3;

public class SemOperacao implements Operacao{
	
	private Operacao proximo;

	@Override
	public double calcula(Calculadora calculadora) {
		if(true) {
			throw new RuntimeException("O usu�rio n�o adicionou nenhum valor de operacao valido!!");
		}
		return 0;
	}

	@Override
	public void setProximo(Operacao operacao) {
		
		
		
	}



}
