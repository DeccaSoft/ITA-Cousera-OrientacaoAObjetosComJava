import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		//cria instancias da classe Pizza
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		//adiciona os ingredientes á 1ª pizza
		pizza1.adicionaIngrediente("catupiry"); 
		pizza1.adicionaIngrediente("carne seca");
		
		//adiciona os ingredientes á 2ª pizza
		pizza2.adicionaIngrediente("mussarela");
		pizza2.adicionaIngrediente("bacon");
		pizza2.adicionaIngrediente("carne seca");
		pizza2.adicionaIngrediente("toscana");
		
		//adiciona os ingredientes á 3ª pizza
		pizza3.adicionaIngrediente("catupiry");
		pizza3.adicionaIngrediente("frango");
		pizza3.adicionaIngrediente("tomate seco");
		pizza3.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("presunto");
		pizza3.adicionaIngrediente("bacon");
		
		//instancia a classe CarrinhoDeCompra e insere algumas pizzas a ela
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);
		
		System.out.println("O total a ser pago é de R$"+carrinho.getValorTotalPizzas()+"!");//exibe o valor total a ser pago
		System.out.println(" ");
		imprimeQuantidadeIngrediente();//chama o método para informar quais ingredientes foram uzados e quantas vezes o foram
		
	}
	
	private static void imprimeQuantidadeIngrediente() {
		System.out.println("A quantidade utilizada de cada ingrediente foi:");
		System.out.println(" ");
		HashMap<String,Integer>todosIngredientes = Pizza.lista;
		for(Map.Entry<String,Integer> ingrediente : todosIngredientes.entrySet())
			System.out.printf("%-15s%4s%n", ingrediente.getKey(), ingrediente.getValue());
	}

}
