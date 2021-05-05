package L2;

import javax.swing.JOptionPane;

/* Até 10 anos - R$ 30,00
 * Acima de 10 até 29 anos - R$ 60,00
 * Acima de 29 até 45 anos - R$ 120,00
 * Acima de 45 até 59 anos - R$ 150,00
 * Acima de 59 até 65 anos - R$ 250,00
 * Maior que 65 anos - R$ 400,00*/
public class R10 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Insira o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
		JOptionPane.showMessageDialog(null,"Então "+ nome + ", de acordo com"
				+ "a sua idade, o seu plano terá o valor de \n" + 
				VendedorPlanoDeSaude.verifica(idade));
	}
}

class VendedorPlanoDeSaude{
	public static String verifica(int idade) {
		if(idade > 0 && idade < 10) return "R$ 30,00";
		if(idade > 10 && idade < 29) return "R$ 60,00";
		if(idade > 29 && idade < 45) return "R$ 120,00";
		if(idade > 45 && idade < 59) return "R$ R$ 150,00";
		if(idade > 59 && idade < 65) return "R$ 250,00";
		if(idade > 65) return "R$ 400,00";
		else return "";
	}
}