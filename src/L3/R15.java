package L3;

import javax.swing.JOptionPane;

//Criar um programa que leia um número que será o limite superior de um intervalo e
//o incremento. Exibir todos os números naturais no intervalo de 0 até esse número.
//Suponha que os dois números lidos são maiores que zero. 
public class R15 {
	public static void main(String[] args) {
		
		ConfiguracaoTela.configura();
		try {
			int numeroLim = Integer.parseInt(JOptionPane.showInputDialog("Insira o número limite"));
			int numeroIncremento = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de incremento"));
			
			JOptionPane.showMessageDialog(null, CalculadoraDeIntervalos.calcula(numeroLim,numeroIncremento));
				
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
		
	}
}
class CalculadoraDeIntervalos{
	public static String calcula(int n1, int n2) {
		String resultado = "";
		boolean valorVerdade = true;
		int aux = 0;
		while (valorVerdade) {
			resultado += aux +"; "; 
			if(aux <=n1) aux += n2;
			else valorVerdade = false;
		}
		return resultado;
	}
}