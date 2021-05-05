package L4;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

/*
 * 1ª) Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro,
através de um método.*/
public class R16 {
	public static void main(String[] args) {
		ConfiguracaoTela.configura();
		try {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
			JOptionPane.showMessageDialog(null,
					"<html>resultado: <h1 color='green'>" + ODobroOuNada.calcula(valor) + "</h1>");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class ODobroOuNada {
	public static int calcula(int valor) {return valor * 2;}
}
