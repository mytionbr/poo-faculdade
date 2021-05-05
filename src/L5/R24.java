package L5;

import java.util.function.BiPredicate;
import java.util.function.Function;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

/* Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um
triângulo. Na classe definir um método para leitura da base e altura, um método construtor
e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
*/

class Triangulo {
	
	private double altura;
	private double base;

	Triangulo(double altura, double base) {
		this.setAltura.apply(altura);
		this.setBase.apply(base);
	}
	
	public Function<Double,Void> setAltura = x -> {this.altura = x;return null;};
	
	public Function<Double,Void> setBase = x -> {this.base = x;return null;};
	
	public Function<Void,Double> getAltura = x -> altura;
	
	public Function<Void,Double> getBase = x -> base;

	public Function<Void, Double> calcularArea = x -> (this.altura * this.base) / 2;
	

}


public class R24 {
	public static void main(String[] args) {
		ConfiguracaoTela.configura();

		JOptionPane.showMessageDialog(null,
				"<html><h1>Formula:" + "<h2 style='color:red; font-size:30px;'> Area = (Base X Altura)/2 ");
		try {

			double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura do triangulo "));
			double base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base do triangulo "));

			Triangulo triangulo = new Triangulo(altura, base);
			
			JOptionPane.showMessageDialog(null,
					"<html>A área do triagulo (" + triangulo.getAltura.apply(null) + " * " + triangulo.getBase.apply(null)
							+ ")/2 = <p style='color:green'>" + triangulo.calcularArea.apply(null) + "</p> ");

		} catch (NullPointerException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

	
