package L4;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

public class R23 {
	public static void main(String[] args) {
		ConfiguracaoTela.configura();
		try {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
			JOptionPane.showMessageDialog(null,
					"<html>resultado: " + EhPrimo.verifica(valor));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class EhPrimo {
	
	public static String  verifica(int valor) { 
		boolean aux = true;
		for (int e = 2; e < valor; e++)	
			if (valor % e == 0) 
				aux = false;

		if(aux)
			return "<h1 style='color:green;font-size:30px;'>O número é primo";
		else 
			return "<h1 style='color:red;font-size:30px;'>O número  não é primo";
	}
}