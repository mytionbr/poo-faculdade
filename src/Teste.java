import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o primeiro valor");
		a = input.nextInt();
		System.out.println("Digite o segundo valor");
		b = input.nextInt();
		
		System.out.println("O resultado da soma dos dois valores é: "+ (a+b));
	}
}
