package L6;

public class MediaNotas {
	
	private double n3;
	private double n2;
	private double n1;
	
	private ModeloDeEnsino modeloDeEnsino;
	
	public MediaNotas(double n1, double n2, double n3, ModeloDeEnsino modeloDeEnsino) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.modeloDeEnsino = modeloDeEnsino;
	}
	
	public double getMedia(){
		return this.modeloDeEnsino.calculaMedia(n1, n2, n3);
		
	}
	
}
