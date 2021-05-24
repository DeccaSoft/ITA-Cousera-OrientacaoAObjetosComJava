package com.coursera.pizzaria;

import com.coursera.object.CarrinhoDeCompras;
import com.coursera.object.Pizza;

public class Principal {

	public static void main(String[] args) {

		// instanciando a classe Pizza
		Pizza p1 = new Pizza();
		// Pizza p2 = new Pizza();
		// Pizza p3 = new Pizza();

		// atribuindo informações
		p1.adicionaIngrediente("Musarela");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Atum");
		p1.adicionaIngrediente("Frango");

		// instanciando a classe CarrinhoDePizza
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		// carrinhoDeCompras.addPizza(pedidoPizza1);
		// carrinhoDeCompras.addPizza(pedidoPizza2);
		// carrinhoDeCompras.addPizza(pedidoPizza3);

		// Mostrando o Resultado
		System.out.println("Total de pizzas: " + carrinhoDeCompras.totalPizzas());
		System.out.println("Preço Total: " + carrinhoDeCompras.getPrecoTotal());
		System.out.println("Ingredientes: " +  Pizza.getListaIngredientes());

	}

}
