package L4;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

/*Criar um programa que receba um grau e o converta para radianos através de um
método*/
public class R19 {
	public static void main(String[] args) {
		ConfiguracaoTela.configura();
		try {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			JOptionPane.showMessageDialog(null,
					"<html>resultado: <h1 color='green'>" + ConversorRadianos.converter(valor) + "</h1>");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class ConversorRadianos {
	public static double converter(double grau) {return (grau * Math.PI /180);}
}