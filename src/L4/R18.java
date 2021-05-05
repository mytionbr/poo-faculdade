package L4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

/*3ª) Criar um programa que receba 2 valores e calcule o produto através de um método que
retorna valores.*/
public class R18 {
	public static void main(String[] args) {
		
		ConfiguracaoTela.configura();
		
		try {
			List<Integer> valores = new ArrayList<Integer>();
			int a = 1;
			while(a < 3) {
				int valor = Integer.parseInt(JOptionPane
						.showInputDialog("Insira o "+ a +"° valor"));
				valores.add(valor);
				a++;
			}
			
			JOptionPane.showMessageDialog(null,
					"<html>resultado: <h1 color='green'>" + 
							Produto.calcula(valores) + "</h1>");
			
		
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class Produto {
	public static Integer calcula(List<Integer> valores) {
		return  valores.get(0) * valores.get(1);
	}
}