package L1;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class R2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ol� burgu�s, veja quantos sal�rios m�nimos voc� ganha atualmente \n"
				+ "as custas da m�o de obra barata de chineses dominados pelos desejos celibat�rios");
		System.out.println("--------------------------------------------------------");
		System.out.println("D�gite o sal�rio m�nimo atual:");
		double salarioMinimo = input.nextDouble();
		System.out.println("D�gite o seu sal�rio atual:");
		double salario = input.nextDouble();
		System.out.println(CalculadoraSalario.calculaSalarioMinimo(salario, salarioMinimo));
	}
	
}
class CalculadoraSalario {
	public static String calculaSalarioMinimo(double salario, double salarioMinimo) {
		return "O sal�rio: " + salario + " � equivalente a " + (salario/salarioMinimo) + " salarios m�nimos"; 
	}
}