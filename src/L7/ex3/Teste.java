package L7.ex3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Teste {
	
	private Calculadora calcularora;
	
	@Test
	public void testaOperacaoSoma() {
		
		this.calcularora = new Calculadora(5, 5, '+');
		assertEquals(10,calcularora.calcular());	
		
	}
	
	@Test
	public void testaOperacaoMultiplicacao() {
		
		this.calcularora = new Calculadora(5, 5, '*');
		assertEquals(25,calcularora.calcular());	
		
	}
	
	@Test
	public void testaOperacaoDivicao() {
		
		this.calcularora = new Calculadora(5, 5, '/');
		assertEquals(1,calcularora.calcular());	
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testaOperacaoDivicaoPorZero() {
		
		this.calcularora = new Calculadora(5, 0, '/');
		calcularora.calcular();	
		
	}
	
	@Test
	public void testaOperacaoSubtracao() {
		
		this.calcularora = new Calculadora(10, 5, '-');
		assertEquals(5,calcularora.calcular());	
		
	}
	
	@Test(expected = RuntimeException.class)
	public void testaSemOperacao() {
		
		this.calcularora = new Calculadora(10, 5, 'a');
		calcularora.calcular();
		
	}
}
