package L7.ex4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Teste {
	
	@Test
	public void testaData() {
		Data data = new Data(4, 5, 2021);
		String resultado = data.displayData();
		
		
		assertEquals("4/Maio/2021", resultado);
		
	}
	
	@Test
	public void testaDataMes() {
		Data data = new Data(31, 1, 1000);
		String resultado = data.displayData();
		
		
		assertEquals("31/Janeiro/1000", resultado);
		
	}
	
	@Test(expected = Exception.class)
	public void testaDataErro() {
		Data data = new Data(0, 0, 1000);
		String resultado = data.displayData();
		
		
		assertEquals("31/Janeiro/1000", resultado);
		
	}
}
