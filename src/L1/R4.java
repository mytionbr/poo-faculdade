package L1;
import java.util.Scanner;

public class R4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo ao Convesor Fahrenheit");
		System.out.println("---------------------------------");
		System.out.println("Dígite um valor em graus Centígrados ");
		int cent = input.nextInt();
		int resultado = CalculadoraTemperatura.converteCentigradosEmFahrenheit(cent);
		System.out.println("O valor de " + cent + " °C em graus Fahrenheit é :" + resultado + " °F");
		
	}
}
class CalculadoraTemperatura{
	public static int converteCentigradosEmFahrenheit(int c) { return (9 * c + 160)/5;}
}
