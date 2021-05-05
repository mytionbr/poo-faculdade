package L1;
import java.util.Scanner;

public class R1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Produto p1 = new Produto();
		
		System.out.println("Bem-vindo!!!");
		System.out.println("Adicione o nome do produto: ");
		p1.setNome(input.next());
		System.out.println("Adicione o preco do produto: ");
	    p1.setPreco(input.nextDouble());
		System.out.println("Produto com desconto: preco  " + p1.calculaDesconto());
		System.out.println(p1);
	}	
}
class Produto{
	private String nome;
	private double preco;

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public double calculaDesconto() {
		return preco - (preco * 0.09);
	}
	@Override
	public String toString() {
		return "Produto: nome = " + nome + ", preco = " + preco + "";
	}
} 
