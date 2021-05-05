package L2;

import javax.swing.JOptionPane;

/* Umcomerciante comprou um produto e quer vend�-lo com um lucro de 45% se o valor  da
 * compra for  menor  que  R$20,00; * caso  contr�rio,  o  lucro  ser� de 30%.
 * Entrar com o valor do produto e imprimir o valor da venda.*/
public class R8 {
	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do produto"));
		JOptionPane.showMessageDialog(null,"O valor da venda foi: "
				+ RegrasDeNegocio.calculaValor(valor));
	}
}

class RegrasDeNegocio{
	public static double calculaValor(double valor) {
		return (valor < 20)? valor + (valor*0.45) : valor + (valor*0.30); 
	} 
}