package com.coursera.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.coursera.Produto;
import com.coursera.ProdutoComTamanho;

public class ProdutoComTamanhoTest {

	@Test
	public void testeEquals() {
		Produto pt = new ProdutoComTamanho(1, "Moleton", 20, 5);
		Produto pt1 = new ProdutoComTamanho(1, "Short", 22, 15);
		assertEquals(pt.equals(pt1), pt1.equals(pt));
	}

	@Test
	public void testeHashCode() {
		Produto pt = new ProdutoComTamanho(1, "Vestido", 25, 5);
		Produto pt1 = new ProdutoComTamanho(1, "Boina", 20, 5);
		assertEquals(pt.hashCode(), pt1.hashCode());
	}

}