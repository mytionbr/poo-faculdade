package L1;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class R2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Olá burguês, veja quantos salários mínimos você ganha atualmente \n"
				+ "as custas da mão de obra barata de chineses dominados pelos desejos celibatários");
		System.out.println("--------------------------------------------------------");
		System.out.println("Dígite o salário mínimo atual:");
		double salarioMinimo = input.nextDouble();
		System.out.println("Dígite o seu salário atual:");
		double salario = input.nextDouble();
		System.out.println(CalculadoraSalario.calculaSalarioMinimo(salario, salarioMinimo));
	}
	
}
class CalculadoraSalario {
	public static String calculaSalarioMinimo(double salario, double salarioMinimo) {
		return "O salário: " + salario + " é equivalente a " + (salario/salarioMinimo) + " salarios mínimos"; 
	}
}