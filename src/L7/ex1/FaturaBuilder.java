package L7.ex1;

import java.util.ArrayList;
import java.util.List;

public class FaturaBuilder {

	private int numeroItem;
	private String descricaoItem;
	private int qtdCompradaItem;
	private double precoItem;
	private List<RegrasNegocio> regrasNegocio = new ArrayList<RegrasNegocio>();
	
	

	public FaturaBuilder setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
		return this;
	}


	public FaturaBuilder setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
		return this;
	}



	public FaturaBuilder setQtdCompradaItem(int qtdCompradaItem) {
		this.qtdCompradaItem = qtdCompradaItem;
		return this;
	}



	public FaturaBuilder setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
		return this;
	}



	public FaturaBuilder setRegrasNegocio(RegrasNegocio regrasNegocio) {
		this.regrasNegocio.add(regrasNegocio);
		return this;
	}



	public Fatura build() {
		return new Fatura(numeroItem, descricaoItem, qtdCompradaItem, precoItem, regrasNegocio);
	}
}
