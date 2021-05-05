package L3;

import javax.swing.JOptionPane;

/*Um programa que imprima at� o �n� termo a seq��ncia de Fibonacci. S�rie:
1,1,2,3,5,8,13,21.......*/
public class R12 {
	
	public static void main(String[] args) {
		ConfiguracaoTela.configura();
		try {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor e veja a sua segu�ncia de "
					+ "Fibonacci"));
			JOptionPane.showMessageDialog(null, Fibonacci.calcular(valor),"Resultado",1);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}
class Fibonacci{
	public static String calcular(int valor) {
		String resultado = "<html> ";
		int ant = 0, atual = 0;
		
		for (int i = 0; i < valor; i++) {
			if(i ==1) {
				atual = 1;
				ant = 0;
			}else {
				atual += ant;
				ant = atual - ant;
			}
			
			resultado += " <p style='color:blue;'>" + atual + "</p>";
		}
		return resultado;
	}
}
