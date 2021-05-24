import java.util.ArrayList;

public class CarrinhodeCompra {
	
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private double precoFinal =0;
	

	public void carrinhodeCompra(Pizza pizza) {
		if(pizza.getIngredientes().isEmpty()) {
			System.out.println("ERRO");
		}
		else {
			pizzas.add(pizza);
		}
	}
	
	public int totalPizza() {
		return pizzas.size();
		
	}
	
	public double getPrecoTotal() {
		for(int i=0; i<pizzas.size(); i++) {
			precoFinal += pizzas.get(i).getPreco();
		}
		return precoFinal;
	}


}
