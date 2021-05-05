package L1;
import java.util.Scanner;

public class R5 {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Olá viajante, fui criado com um único propósito.....");
		PausaDeTempoDramatico.pausa();
		System.out.println("Calcular o volume de uma lata.....");
		PausaDeTempoDramatico.pausa();
		System.out.println("(E você ainda acha que a sua vida é triste???)");
		System.out.println("Sem mais delongas, me faça sentir vivo........ ");
		PausaDeTempoDramatico.pausa();
		System.out.println("Me diga quanto cm de altura tem a sua lata:");
		int cm = input.nextInt();
		System.out.println("Hummmmmmmmmmmm, agora me diga qual é o bendito raio da sua lata: (Em cm)");
		int raio = input.nextInt();
		PausaDeTempoDramatico.pausa();
		System.out.println("....... que interessante ...............");
		PausaDeTempoDramatico.pausa();
		System.out.println("....... isso é estranho ...............");
		PausaDeTempoDramatico.pausa();
		float resultado = CalculaLitroDeLata.propositoDeVidaDoRoboRobertDeAragornOUtimoDeSeuNome(cm,raio);
		System.out.println("Opa, desculpe pela demora. A lata tem " +resultado+ " (L)");
	}
	
}
class PausaDeTempoDramatico {
	public static void pausa() throws InterruptedException {
		Thread.sleep(new Long(3000));
	}
}
class CalculaLitroDeLata{

	public static float propositoDeVidaDoRoboRobertDeAragornOUtimoDeSeuNome(int altura, int raio) {
		return (float) (Math.PI * (raio^2)* altura)/100;	
	}
	
}
