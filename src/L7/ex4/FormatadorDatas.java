package L7.ex4;

import java.util.HashMap;
import java.util.Map;

public class FormatadorDatas {

	private final Map<Integer, String> meses = new HashMap<Integer, String>();

	
	public FormatadorDatas() {
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Março");
		meses.put(4, "Abril");
		meses.put(5, "Maio");
		meses.put(6, "Junho");
		meses.put(7, "Julho");
		meses.put(8, "Agosto");
		meses.put(9, "Setembro");
		meses.put(10, "Outubro");
		meses.put(11, "Novembro");
		meses.put(12, "Dezembro");
	}
	
	public String formata(Data data) {
	
		return data.getDia() + "/" + meses.get(data.getMes()) + "/" + data.getAno();
	}
	
	
}
