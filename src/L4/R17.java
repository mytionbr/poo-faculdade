package L4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

/*2ª) Criar um programa que receba 4 notas e calcule a média aritmética,
 *  através de um método.*/
public class R17 {
	public static void main(String[] args) {
		
		ConfiguracaoTela.configura();
		
		try {
			List<Integer> valores = new ArrayList<Integer>();
			int a = 1;
			while(a < 5) {
				int valor = Integer.parseInt(JOptionPane
						.showInputDialog("Insira o "+ a +"° valor"));
				valores.add(valor);
				a++;
			}
			
			JOptionPane.showMessageDialog(null,
					"<html>resultado: <h1 color='green'>" + 
							MediaAritmetica.calcula(valores) + "</h1>");
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class MediaAritmetica {
	public static double calcula(List<Integer> valores) {
		return  valores
					.stream()
					.mapToDouble(Integer::doubleValue)
					.average()
					.orElse(0.0); 
	}
}