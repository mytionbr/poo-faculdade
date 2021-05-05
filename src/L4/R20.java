package L4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

/*5ª) Criar um programa que mostre qual o maior valor entre dois números, utilizando um
método do tipo void (que não retorna valores). */
public class R20 {
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
			
			MaiorNumero m = new MaiorNumero();
			m.ehMaior(valores);
			
			JOptionPane.showMessageDialog(null,
					"<html>resultado: <h1 color='green'>" + 
							m + "</h1>");
			
		
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class MaiorNumero {
	private int maiorNumero;
	
	
	public void ehMaior(List<Integer> valores) {
			Collections.sort(valores);
			this.maiorNumero = valores.get(1);
	}
	
	@Override
		public String toString() {
			return "" + this.maiorNumero;
		}
}
