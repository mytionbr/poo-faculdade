package L7.ex4;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private FormatadorDatas formatador;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		verificaValores();
		
		this.formatador = new FormatadorDatas();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public String displayData() {
		return this.formatador.formata(this);
	}
	
	private void verificaValores() {
		boolean ehInvalido = false;
		
		if(this.getAno() <= 0)
			 ehInvalido = true;
		else if(this.getMes() < 1 || this.getMes() > 12)
			 ehInvalido = true;
		else if(this.getDia() < 1 || this.getDia() > 31)
			 ehInvalido = true;
		if(ehInvalido) 
			throw new NumberFormatException("Valor invalido");
	}
}
