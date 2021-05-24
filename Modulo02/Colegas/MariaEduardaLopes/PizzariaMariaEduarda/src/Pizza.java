import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	static int qntdIngrediente =0;
	private double preco;
	private ArrayList<String> ingredientes = new ArrayList<String>();
	static Map<String, Integer> mapaIngredientes = new HashMap<String, Integer>();
	
	
	
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public static Map<String, Integer> getMapaIngredientes() { //talvez tenha q mudar o mapaIngredientes para lista de ingredientes
		return mapaIngredientes;
	}

	
	public static void contabilizarIngrediente(String ingrediente) {
		
		if (mapaIngredientes.containsKey(ingrediente)) {
			
			int valor = mapaIngredientes.get(ingrediente);
			mapaIngredientes.put(ingrediente, valor+1);
		}
		else {
			
			mapaIngredientes.put(ingrediente, 1);
		}
		qntdIngrediente++;
	}
	
	public void adcIngrediente( String ingrediente){
		this.ingredientes.add(ingrediente);
		contabilizarIngrediente(ingrediente);
		
	}
	
	public double getPreco() {
		
		if (ingredientes.size()<= 2) {
			preco = 15;
			
		}
		else if (ingredientes.size()>2  && ingredientes.size()<6) {
			preco = 20;
		}
		else {
			preco =  23;
		}
		return preco;
	}

}
