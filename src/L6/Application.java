package L6;

import javax.swing.JOptionPane;

public class Application {

	private ModeloDeEnsino modeloDeEnsino;
	private String opcoes[] = { "Superior", "Técnico" };
	private double[] notas = new double[3];
	private int escolha;
	private Double resultado;

	private void exibePrimeiraTela() {
		escolha = JOptionPane.showOptionDialog(null, "Para qual nível de ensino você quer aplicar a média de notas ",
				"Escolha", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
	}

	private void validaEscolha()  {
		if (escolha == JOptionPane.YES_OPTION) {
			modeloDeEnsino = ModeloDeEnsino.SUPERIOR;
		} else if (escolha == JOptionPane.NO_OPTION) {
			modeloDeEnsino = ModeloDeEnsino.TECNICO;
		}else {
			System.exit(0);
		}
	}

	private void exibeTelasInsercao() {
		int i = 0;
		int times = 2;
		while (i <= times) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da N " + (i + 1)));
			i++;
		}
	}

	private void calculaMedia() {
		MediaNotas mediaNotas = new MediaNotas(notas[0], notas[1], notas[2], modeloDeEnsino);
		resultado = mediaNotas.getMedia();
	}

	private void exibeResultado() {
		JOptionPane.showMessageDialog(null, "A média final é " + resultado);
	}
	
	private void exibeMensagemErro(Exception e) {
		JOptionPane.showMessageDialog(null, "<html> <h1 style='color:red'>Deu ruim");
		throw new RuntimeException(e);
	}
	
	public void executa() {
		try {
			exibePrimeiraTela();
			validaEscolha();
			exibeTelasInsercao();
			calculaMedia();
			exibeResultado();
		} catch (Exception e) {
			exibeMensagemErro(e);
		}
	}

}
