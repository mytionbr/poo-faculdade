package L5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.swing.JOptionPane;

public class R25 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"<html> <h1>Formula: </h1>"
				+ "<h2>R1 = -b+ (raiz de delta) / (2*a)"
				+"<h2> R2 = -b-(raiz de delta) / (2*a)" );
		
		try{
			double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura de a"));
			double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura de b"));
			double c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura do c"));
			
			Equacao equacao = new Equacao(a,b,c);
			
			List<Double> raizes= equacao.calculaRaizes();
			JOptionPane.showMessageDialog(null,
					"<html> <h1> X1  = " + raizes.get(0)
					+ " <h1> X2 = "+ raizes.get(1));
			
		}catch(NumberFormatException | NullPointerException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>"+e.getMessage()+"</h1>");
		}
	}
}

class Equacao {
	
	private double a;
	private double b;
	private double c;
	
	Equacao() {}

	Equacao(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {return a;}

	public double getB() {return b;}

	public double getC() {return c;}
	
	public Function<Void,Double> calculaDelta = x -> Math.pow(this.b, 2) - (4 * this.a * this.c);

	public List<Double> calculaRaizes() throws Exception {
		
		double raizDelta = calculaDelta.apply(null);
		
		if (raizDelta == 0)
			throw new Exception("As raizes são iguais");
		if (raizDelta < 0)
			throw new Exception("Não existem raizes reais");
		else {
			double r1 = ((-this.b) + (Math.sqrt(raizDelta))) / (2 * this.a);
			double r2 = ((-this.b) - (Math.sqrt(raizDelta))) / (2 * this.a);

			return new ArrayList<Double>(Arrays.asList(r1, r2));
		}
	}

	

}