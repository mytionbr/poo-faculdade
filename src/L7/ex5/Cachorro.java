package L7.ex5;

public class Cachorro extends Animal{
	
	private String nome;
	private String raca;

	public Cachorro(String tipo, String cor, String nome, String raca) {
		super(tipo, cor);
		this.nome = nome;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
