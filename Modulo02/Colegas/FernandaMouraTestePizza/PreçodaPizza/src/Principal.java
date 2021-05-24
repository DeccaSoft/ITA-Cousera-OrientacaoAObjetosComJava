public class Principal {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Oregano");
		
		p2.adicionaIngrediente("Molho apimentado");
		p2.adicionaIngrediente("Queijo ralado");
		p2.adicionaIngrediente("Milho");
		p2.adicionaIngrediente("Frango");
		
		p3.adicionaIngrediente("Maionese");
		p3.adicionaIngrediente("Cebloa");
		p3.adicionaIngrediente("Banana");
		p3.adicionaIngrediente("Chocolate");
		p3.adicionaIngrediente("Calabesa");
		
		carrinhoDeCompras c = new carrinhoDeCompras(); 
		
		c.adicionarPizza(p1);
		c.adicionarPizza(p2);
		c.adicionarPizza(p3);
		
		System.out.println("A quantidade total de pizza foi de: "+c.quantidadePizza());
		System.out.println(" O valor total pago foi de R$ "+c.precoPagar());
		
		System.out.println("A quantidade usada de cada ingrediente foi de: "+p1.contador);   	
		System.out.println("A quantidade usada de cada ingrediente foi de: "+p2.contador);  
		System.out.println("A quantidade usada de cada ingrediente foi de: "+p3.contador);  
		
	}

}

