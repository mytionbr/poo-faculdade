package L1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class R3 {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		MaquinaEscrever.escreve("Olá Onii-chan!!!!!!",new Long(100));
		MaquinaEscrever.escreve
				("Você deseja calcular a média de dois números ........", new Long(100));
		MaquinaEscrever.escreve("Tu não sabe fazer isso na mão, não?",new Long(100));
		MaquinaEscrever.escreve("Mas enfim, manda o primeiro número ai meu bom:",new Long(100));
		float v1 = input.nextFloat();
		MaquinaEscrever.escreve("Tá bom, pode mandar o segundo:",new Long(100));
		float v2 = input.nextFloat();
		MaquinaEscrever.escreve("A média dos dois valores é : " + MediaValores.calculaMedia(v1, v2),new Long(100));
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