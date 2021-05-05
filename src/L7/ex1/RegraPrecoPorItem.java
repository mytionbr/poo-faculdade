package L7.ex1;

public class RegraPrecoPorItem implements RegrasNegocio{

	@Override
	public void executa(Fatura fatura) {
		if(fatura.getPrecoItem() < 0) 
		{
			fatura.setPrecoItem(0); 
		}
		
	}

}
