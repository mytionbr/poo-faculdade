package L7.ex5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Teste {
	
	@Test
	public void testaCocker() {
		Cocker cocker = new Cocker("Mamífero", "Verde", "Douglas", "Guaxinim Bolado", true);
		
		assertEquals(false, cocker.precisaTosa());
		
	}
	
}
