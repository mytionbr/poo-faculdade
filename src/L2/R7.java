package L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/* Ler tr�s n�meros e mostr�-los em ordem crescente.*/
public class R7 {
	
	public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo ao ordenando 2000!!!");
		 
		 int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1° numero"));
		 int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2° numero"));
		 int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 3° numero"));
		 
		 
		 
		 JOptionPane.showMessageDialog(null, OrdenadorNumerico.ordenar(new ArrayList(Arrays.asList(
				 numero1,numero2,numero3)))); 
		 
	}
}
class OrdenadorNumerico {
	public static String ordenar(ArrayList<Integer> lista){
		lista.sort((n1,n2) -> n1.compareTo(n2));
		String numeros = "";
		for (Integer integer : lista) {
			numeros += integer + "\n"; 
		}
		return numeros;
	}
}
