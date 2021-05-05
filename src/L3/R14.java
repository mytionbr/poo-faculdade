package L3;

import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Um programa que calcule a média de uma aluno nos moldes da Fatec Zona SUL.
public class R14 {
	public static void main(String[] args) {
		JLabel label1 = new JLabel("<html><h1 style=' border-radius: 25px;\r\n" + "  background: yellow;\r\n"
				+ "  padding: 20px;\r\n" + "  width: 200px;\r\n" + "  height: 150px;'>Insira o nome do aluno:</h1>");

		String nome = JOptionPane.showInputDialog(label1);

		JLabel label2 = new JLabel("<html><h1 style='color:black;'>Formula de avaliação: </h1>" + "<br/>"
				+ "<h2 style='font-size:25px;color:red;'>(P1*0.35 + P2*0.50 + T*0.15)</h2>" + "<br/>"
				+ "<h2 style='font-size:25px;color:blue;'>P1 - Avaliação P2 - Avaliação T- trabalho semestral\r\n"
				+ "</h2>");
		JOptionPane.showMessageDialog(null, label2);
		
		try {
			double avaliacaoP1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da P1"));
			double avaliacaoP2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da P2"));
			double avaliacaoP3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho"));

			JLabel label3 = new JLabel("<html><h1 style='color:blue;'>Nota final: </h1>" + "<br/>"
					+ "<h2 style='font-size:25px;'>  O aluno " + nome + " ficou com a média:</h2>"
					+ Professor.lancaNota(avaliacaoP1, avaliacaoP2, avaliacaoP3));
			JOptionPane.showMessageDialog(null, label3);
		} catch (NumberFormatException | NullPointerException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
		
	}
}
class Professor{
	public static String lancaNota(double p1,double p2,double t) {
		double nota = calcularNota(p1, p2, t);
		if(nota <= 5.9)
			return "<html><h2 style='color:red'>" + nota + "</h2> <br/><h3 style='color:red'>Reprovado</h3>";
		else
			return "<html><h2 style='color:green'>" + nota + "</h2> <br/><h3 style='color:green'>Aprovado</h3>";
	}
public static double calcularNota(double p1,double p2,double t) {
	
	return (p1*0.35 + p2*0.50 + t*0.15);
	}
}
