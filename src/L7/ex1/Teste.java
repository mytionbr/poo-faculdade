package L7.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Teste {
	
	private FaturaBuilder faturaBuilder;

	@Before
	public void criaObjeto() {
		this.faturaBuilder = new FaturaBuilder();
	}
	
	
	@Test
	public void testaRegraQtdPositiva() {
		
		Fatura fatura = faturaBuilder
							.setDescricaoItem("dsafadsfasdfsdf")
							.setNumeroItem(1)
							.setPrecoItem(100.0)
							.setQtdCompradaItem(-19)
							.setRegrasNegocio(new RegraQtdPositiva())
							.build();
		
		assertEquals(0, fatura.getQtdCompradaItem());	
	}
	
	@Test
	public void testaRegraPrecoPorItem() {
		
		Fatura fatura = faturaBuilder
							.setDescricaoItem("dsafadsfasdfsdf")
							.setNumeroItem(1)
							.setPrecoItem(-100.0)
							.setQtdCompradaItem(10)
							.setRegrasNegocio(new RegraPrecoPorItem())
							.build();
		
		assertEquals(0, fatura.getPrecoItem());	
	}
	
	@Test
	public void testaConjuntoRegrasNegocio() {
		
		Fatura fatura = faturaBuilder
							.setDescricaoItem("dsafadsfasdfsdf")
							.setNumeroItem(1)
							.setPrecoItem(-100.0)
							.setQtdCompradaItem(-10)
							.setRegrasNegocio(new RegraPrecoPorItem())
							.setRegrasNegocio(new RegraQtdPositiva())
							.build();
		
		assertEquals(0, fatura.getPrecoItem());	
		assertEquals(0, fatura.getQtdCompradaItem());	
	}
	
	@Test
	public void testaFaturaTotal() {
		
		Fatura fatura = faturaBuilder
							.setDescricaoItem("dfsa")
							.setNumeroItem(4)
							.setPrecoItem(100.0)
							.setQtdCompradaItem(10)
							.setRegrasNegocio(new RegraPrecoPorItem())
							.setRegrasNegocio(new RegraQtdPositiva())
							.build();
		
		assertEquals(1000, fatura.getFaturarTotal());	
		
	}
	
	@Test
	public void testaFaturaTotalFalha() {
		
		Fatura fatura = faturaBuilder
							.setDescricaoItem("dfsa")
							.setNumeroItem(4)
							.setPrecoItem(100.0)
							.setQtdCompradaItem(-19)
							.setRegrasNegocio(new RegraPrecoPorItem())
							.setRegrasNegocio(new RegraQtdPositiva())
							.build();
		
		assertEquals(0, fatura.getFaturarTotal());	
		
	}
	@Test
	public void testaSemRegra() {
		
		Fatura fatura = faturaBuilder
							.setDescricaoItem("dfsa")
							.setNumeroItem(4)
							.setPrecoItem(100.0)
							.setQtdCompradaItem(2)
							.build();
	
		
		assertEquals(200, fatura.getFaturarTotal());	
		
	}
}
