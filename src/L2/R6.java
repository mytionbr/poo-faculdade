package L2;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class R6 {
	/* Ler um valor e informar se ele � ou n�o m�ltiplo de 3.*/
	
	public static void main(String[] args) {
		 String nome = JOptionPane.showInputDialog("Bem-vindo \n\n digite o seu nome:");
		 System.out.println(nome);
		 
		 JOptionPane.showMessageDialog(null, "Olá " +nome + ", seja bem-vindo ao multiplo de três!!!");
		 
		 int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero e veja se ele é multiplo de 3 "));
		 
		 boolean resultado = VerificaMultiploDe3.verifica(numero);
		 
		 if(resultado)
			 JOptionPane.showMessageDialog(null, "O numero " + numero + " é multiplo de três");
		 else
			 JOptionPane.showMessageDialog(null, "O numero " + numero + " não é multiplo de três");
		 
	}
}
class VerificaMultiploDe3{
	public static boolean verifica(int numero) { return (numero % 3 == 0) ? true : false;}
}
