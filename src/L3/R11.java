package L3;

import javax.swing.JOptionPane;
/*Um programa capaz de imprimir todos os números pares em um intervalo de
números informador pelo usuário*/
public class R11 {
	
	public static void main(String[] args) {
		ConfiguracaoTela.configura();
		try {
			int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro valor"));
			int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo valor"));
			JOptionPane.showMessageDialog(null, CalculadoraNumeroPar.calcular(valor1,valor2));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red; font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}
class CalculadoraNumeroPar{
	public static String calcular(int valor1, int valor2) {
		String resultado = "";
		for (int i = valor1; i <= valor2; i++) 	if(i % 2 == 0) 	resultado += i + "; ";
		
		return resultado;
	}
}