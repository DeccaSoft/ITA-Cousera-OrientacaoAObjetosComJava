import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {

	public static HashMap<String, Integer> ingredienteEQuantidadeTodasPizzas = new HashMap<>();
	private ArrayList<String> _ingredientes = new ArrayList<String>();

	public void adicionaIngrediente(String ingrediente) {
		get_ingredientes().add(ingrediente);
		contabilizaIngrediente(ingrediente);

	}

	private void contabilizaIngrediente(String ingrediente) {
		ingredienteEQuantidadeTodasPizzas.putIfAbsent(ingrediente, 0);
		ingredienteEQuantidadeTodasPizzas.put(ingrediente, ingredienteEQuantidadeTodasPizzas.get(ingrediente) + 1);
	}

	public String getPreco() {
		if (get_ingredientes().size() >= 6)
			return "23 Reais";
		if (get_ingredientes().size() >= 3)
			return "20 Reais";
		return "15 Reais";
	}

	public ArrayList<String> get_ingredientes() {
		return _ingredientes;
	}

}
