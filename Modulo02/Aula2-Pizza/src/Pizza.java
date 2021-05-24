/**
 * 
 * @author André Morais de Azevedo
 * @date 09/08/2020 - 13:49
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
	
	 static int qtdIngredientes = 0;
	 double precoPizza = 0;
	 static HashMap<String, Integer> mapaIngredientes = new HashMap<>();
	 private ArrayList<String> ingredientes = new ArrayList<String>();
	
	public void adicionaIngrediente(String ingrediente) {
		qtdIngredientes = 0;
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	public void getPreco() {
		if(mapaIngredientes.size() >0 && mapaIngredientes.size() <= 2) {
			precoPizza  = 15;
		}else if(mapaIngredientes.size() >= 3 && mapaIngredientes.size() <= 5) {
			precoPizza  = 20;
		}else if(mapaIngredientes.size() > 5){
			precoPizza  = 23;
		}else {
			System.out.println("Quantidade de Ingredientes Deve ser Maior que Zero!!!");
			precoPizza = 0;
			qtdIngredientes = 0;
		}
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		if(mapaIngredientes.containsKey(ingrediente)) {
			int id = mapaIngredientes.get(ingrediente);
			mapaIngredientes.put(ingrediente, id+1);
		}else {
			mapaIngredientes.put(ingrediente, 1);
		}
		qtdIngredientes++;
	}
	
	public static void zerarListaIngredientes() {
		mapaIngredientes.clear();
	}
	
}
