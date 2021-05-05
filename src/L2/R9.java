package L2;

import javax.swing.JOptionPane;

/*Ler a  idade de uma pessoa e informar a suaclasse eleitoral:
 * Não-eleitor (abaixo de 16 anos)
 * Eleitor obrigatório(entre 18 e 65 anos)
 * Eleitor facultativo(entre 16 e 18 anos e maior de 65 anos)*/
public class R9 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade:"));
		JOptionPane.showMessageDialog(null, "Opa, você é um : " + Eleitor.qualEleitor(idade));
	}
}
class Eleitor{
	public static String qualEleitor(int idade) {
		if(idade < 16) return "Não-eleitor";
		if(idade < 65 && idade >= 18) return "Eleitor obrigatório";
		if((idade >= 16 && idade < 18)|| idade >65) return " Eleitor facultativo";
		else return "";
	}
}
