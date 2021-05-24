import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList<Pizza> todasAsPizzas = new ArrayList<>();//armazena objetos Pizza
	
	//adiciona somente as pizzas que possuem um ou mais ingredientes no ArrayList da classe
	public void adicionaPizza(Pizza p) {
		   if (p.getPreco() == 0 ) {
			   System.out.println("Esta pizza não possui ingredientes!");
	        }
		todasAsPizzas.add(p);
	
	}
	
	//faz um loop pelo ArrayList e recebe o getValorTotalDosIngredientes de todas instancias que estiverem no ArrayList todasAsPizzas
	//soma todos os valores e retorna ao chamador a soma de todos eles
	public int getValorTotalPizzas() {
		int somaTotal = 0;
		for(Pizza p : todasAsPizzas)
			somaTotal += p.getValorTotalDosIngredientes();
		
		return somaTotal;
	}
	
}
