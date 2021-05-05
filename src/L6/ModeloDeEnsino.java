package L6;

public enum ModeloDeEnsino implements NotaStrategy{
	SUPERIOR{
		@Override
		public double calculaMedia(double n1, double n2, double n3) {
			return (n1 * 0.35 + n2 *0.5 + n3 * 0.15);
		}
	},
	
	TECNICO{
		@Override
		public double calculaMedia(double n1, double n2, double n3) {
			return (n1 + n2*2 + n3*2 ) / 5;
		}
	}
}
