package L7.ex5;

public class Cocker extends Cachorro {
	
	private boolean tosa;
	
	public Cocker(String tipo, String cor, String nome, String raca, boolean tosa) {
		super(tipo, cor, nome, raca);
		this.tosa = tosa;
	}

	public boolean isTosa() {
		return tosa;
	}
	
	public boolean precisaTosa() {
		return (tosa)? false : true;
	}
	
	public void setTosa(boolean tosa) {
		this.tosa = tosa;
	}
	
}
