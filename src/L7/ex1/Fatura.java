package L7.ex1;

import java.util.List;

public class Fatura {
	
	private int numeroItem;
	private String descricaoItem;
	private int qtdCompradaItem;
	private double precoItem;
	private List<RegrasNegocio> regraNegocio;

	public Fatura(int numeroItem, String descricaoItem, int qtdCompradaItem, double precoItem, List<RegrasNegocio> regrasNegocio) {
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
		this.qtdCompradaItem = qtdCompradaItem;
		this.precoItem = precoItem;
		this.regraNegocio = regrasNegocio;
		
		executaRegrasNegocio();
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getQtdCompradaItem() {
		return qtdCompradaItem;
	}

	public void setQtdCompradaItem(int qtdCompradaItem) {
		this.qtdCompradaItem = qtdCompradaItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	private void executaRegrasNegocio() {
		this.regraNegocio.forEach(regra -> regra.executa(this));
	}
	
	public double getFaturarTotal() {
		return this.qtdCompradaItem * this.precoItem;
	}
	
}
