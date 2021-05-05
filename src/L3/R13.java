package L3;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;
/*
 * Um programa capaz de imprimir todos os números primos em um intervalo de
 * números informado pelo usuário;
 */
public class R13 {

	public static void main(String[] args) {
		ConfiguracaoTela.configura();
		try {
			int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
			int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
			JOptionPane.showMessageDialog(null, "<html> Os números primos entre: <p style='color:red;'>" 
					+ valor1 + " e \r " + valor2 + "</p>\n\n"
					+ Primo.calculaValor(valor1, valor2), "Resultado", 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}
class Primo {
	public static String calculaValor(int valor1, int valor2) {
		String resultado = "";
		for (int i = valor1; i <= valor2; i++) {
			if (ehPrimo(i))
				resultado += i + "; ";
		}
		return resultado;
	}

	public static boolean ehPrimo(int valor) {
		boolean resultado = true;
		for (int e = 2; e < valor; e++) {
			if (valor % e == 0)
				return resultado = false;
		}
		return resultado;
	}
}
