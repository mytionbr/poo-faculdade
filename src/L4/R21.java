package L4;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import L3.ConfiguracaoTela;

public class R21 {
	public static void main(String[] args) {
		
		ConfiguracaoTela.configura();
		
		try {
				int valor = Integer.parseInt(JOptionPane
						.showInputDialog("Insira o um valor"));
							
			Calendario m = new Calendario();
			m.ehDia(valor);
			
			JOptionPane.showMessageDialog(null,
					"<html>resultado:" + 
							m);
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "<html><h1 style='color:red;font-size:30px;'>Valor invalido!!</h1>");
		}
	}
}

class Calendario {
	private String diaMes;
	
	
	public void ehDia (int valor) {
		 
		switch (valor) {
		case 1: this.diaMes = "<h1 color='green'> Janeiro";
			break;
		case 2: this.diaMes = "<h1 color='green'>Fevereiro";
		break;
		case 3: this.diaMes = "<h1 color='green'>Março";
		break;

		default:
			this.diaMes = "<h1 color='red'> Dia invalido :(";
			break;
		}
	}
	
	@Override
		public String toString() {
			return "" + this.diaMes ;
		}
}