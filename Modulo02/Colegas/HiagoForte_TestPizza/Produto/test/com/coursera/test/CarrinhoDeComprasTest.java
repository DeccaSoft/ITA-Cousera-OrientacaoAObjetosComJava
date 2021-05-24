package com.coursera.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.coursera.CarrinhoDeCompras;
import com.coursera.Produto;

public class CarrinhoDeComprasTest {

	@Test
	public void testeQuantidadeNoCarrinho() {
		Produto p = new Produto(12, "Camiseta", 15);
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p, 3);
		assertEquals(CarrinhoDeCompras.getQuantidadeNoCarrinho(), 3);

	}

}