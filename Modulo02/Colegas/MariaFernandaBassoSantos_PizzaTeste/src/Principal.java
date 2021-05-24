
public class Principal {

	public static void main(String[] args) {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Mussarela");
		meuCarrinho.adicionar(pizza1);
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Calabresa");
		pizza2.adicionaIngrediente("Cebola");
		meuCarrinho.adicionar(pizza2);
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Palmito");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Ervilha");
		pizza3.adicionaIngrediente("Presunto");
		meuCarrinho.adicionar(pizza3);
		
		System.out.println("Ingrediente(s) da primeira pizza: Mussarela");
		System.out.println("Ingrediente(s) da segunda pizza: Mussarela, Calabresa, Cebola");
		System.out.println("Ingrediente(s) da terceira pizza: Mussarela, Cebola, Palmito, Milho, Ervilha, Presunto");
		
		System.out.println("Total: " + meuCarrinho.total() + " reais");
		
		System.out.println("Quantidade utilizada de cada ingrediente:");
		for (String ingrediente : Pizza.ingredientesPizzas.keySet()) {
			System.out.println(ingrediente + ": " + Pizza.ingredientesPizzas.get(ingrediente));
		}
		
	}

}
