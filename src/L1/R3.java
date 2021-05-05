package L1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class R3 {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		MaquinaEscrever.escreve("Ol� Onii-chan!!!!!!",new Long(100));
		MaquinaEscrever.escreve
				("Voc� deseja calcular a m�dia de dois n�meros ........", new Long(100));
		MaquinaEscrever.escreve("Tu n�o sabe fazer isso na m�o, n�o?",new Long(100));
		MaquinaEscrever.escreve("Mas enfim, manda o primeiro n�mero ai meu bom:",new Long(100));
		float v1 = input.nextFloat();
		MaquinaEscrever.escreve("T� bom, pode mandar o segundo:",new Long(100));
		float v2 = input.nextFloat();
		MaquinaEscrever.escreve("A m�dia dos dois valores � : " + MediaValores.calculaMedia(v1, v2),new Long(100));
	}
}
class MediaValores{
	public static float calculaMedia(float v1, float v2) {
		return (v1 + v2) / 2;
	}
}
class MaquinaEscrever{
	public static void escreve(String frase, long tempoPausa) {
		List<String> palavras = new ArrayList(Arrays.asList((frase.split(""))));
		palavras.forEach(letra -> {
			System.out.print(letra);
			try {
				Thread.sleep(tempoPausa);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});
		System.out.println("");
			     
	}

}