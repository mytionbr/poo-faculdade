package L7.ex1;

public class RegraQtdPositiva implements RegrasNegocio{

	@Override
	public void executa(Fatura fatura) {
		if(fatura.getQtdCompradaItem() < 0) 
		{
			fatura.setQtdCompradaItem(0);
		}
	}

}
