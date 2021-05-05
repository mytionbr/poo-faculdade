package L7.ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Teste {
	
	private AumentoSalario aumentoSalario;
	
	@Before
	public void criaObjeto() {
		this.aumentoSalario = new AumentoSalario();
	}
	
	@Test
	public void testaAumentoSalario() {
		Empregado empregado1 = new  Empregado("Matheus", "Sousa", 1000.00);
		Empregado empregado2 = new Empregado("Bruna", "Silva", 2000.00);
		
		aumentoSalario.calculaAumento(empregado1, 10);
		aumentoSalario.calculaAumento(empregado2, 10);
		
		
		System.out.println(empregado1.getSalarioMensal());
		assertEquals(1100, empregado1.getSalarioMensal());
		assertEquals(2200, empregado2.getSalarioMensal());
	}
	
}