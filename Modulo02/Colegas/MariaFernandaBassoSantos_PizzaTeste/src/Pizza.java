import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pizza {
	static Map<String, Integer> ingredientesPizzas = new HashMap<String, Integer>();
	Set<String> ingredientesPizza = new HashSet<String>();
	
	public void adicionaIngrediente(String ingrediente) {
		ingredientesPizza.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		if (!ingredientesPizzas.containsKey(ingrediente)) ingredientesPizzas.put(ingrediente, 0);
		ingredientesPizzas.put(ingrediente, ingredientesPizzas.get(ingrediente)+1);
	}
	
	public int getPreco() {
		int numIngredientes = ingredientesPizza.size();
		if (numIngredientes > 0 && numIngredientes <= 2) return 15;
		else if (numIngredientes >= 3 && numIngredientes <= 5) return 20;
		else if (numIngredientes > 5) return 23;
		return 0;
	}
}
