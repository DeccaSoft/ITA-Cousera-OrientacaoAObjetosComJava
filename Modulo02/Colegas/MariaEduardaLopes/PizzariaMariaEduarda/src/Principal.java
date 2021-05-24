
public class Principal {

	public static void main(String[] args) {
		
		CarrinhodeCompra c = new CarrinhodeCompra();
		
		Pizza p1 = new Pizza();
		
		p1.adcIngrediente("molho");
		p1.adcIngrediente("milho");
		p1.adcIngrediente("queijo");
		c.carrinhodeCompra(p1);

		Pizza p2 = new Pizza();
		
		p2.adcIngrediente("molho");
		p2.adcIngrediente("calabresa");
		c.carrinhodeCompra(p2);
		
		Pizza p3 = new Pizza();
		
		p3.adcIngrediente("molho");
		p3.adcIngrediente("queijo");
		p3.adcIngrediente("presunto");
		p3.adcIngrediente("oregano");
		p3.adcIngrediente("azeitona");
		p3.adcIngrediente("ovo");
		c.carrinhodeCompra(p3);
		
		Pizza p4 = new Pizza();
		c.carrinhodeCompra(p4);
		
		System.out.println("Total de pizzas no carrinho: " + c.totalPizza());
		System.out.println("Valor total:  " + c.getPrecoTotal());
		
		System.out.println("lista de ingredientes utilizados: "+ Pizza.getMapaIngredientes());
		}
		
	}