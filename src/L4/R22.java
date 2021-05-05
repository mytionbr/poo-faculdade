package L4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

public class R22 {
public static void main(String[] args) {
		ConfiguracaoTela.configura();
		try {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
			JOptionPane.showMessageDialog(null,
					"<html>resultado: <h1 color='green'>" + Fatorial.calcula(valor) + "</h1>");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class Fatorial {
	
	public static String calcula(int valor) { 
		String resultado = "";
		int fatorial = 1; 
		for (int i = valor ; i > 0; i--) {
				fatorial *= i;
				resultado += i + " x ";
		};
		resultado = resultado.substring(0, resultado.length() - 2);
		return resultado += " = "+ fatorial; 
	}
}
