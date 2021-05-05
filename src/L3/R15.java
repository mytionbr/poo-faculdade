package L3;

import javax.swing.JOptionPane;

//Criar um programa que leia um n�mero que ser� o limite superior de um intervalo e
//o incremento. Exibir todos os n�meros naturais no intervalo de 0 at� esse n�mero.
//Suponha que os dois n�meros lidos s�o maiores que zero. 
public class R15 {
	public static void main(String[] args) {
		
		ConfiguracaoTela.configura();
		try {
			int numeroLim = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero limite"));
			int numeroIncremento = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero de incremento"));
			
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