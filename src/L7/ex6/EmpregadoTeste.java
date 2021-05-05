package L7.ex6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EmpregadoTeste {
	
	@Test
	public void testaEmpregado() {
		Empregado empregado = new  Empregado("Matheus", 20, 1.80, 'M', 100000);
		
		assertEquals(100000, empregado.obterLucros());
	}
}
