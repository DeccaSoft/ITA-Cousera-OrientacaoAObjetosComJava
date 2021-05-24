package com.br.metodosacessodata.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.br.metodosacessodata.Pessoa;

public class TestePessoa {

	private Pessoa p;

	@Test
	public void testeUm() {
		p = new Pessoa("06/08/2000");
		assertEquals(20, p.getIdade());
		assertEquals("Leão", p.getSigno());
	}

	@Test
	public void testeDois() {
		p = new Pessoa("06/01/1998");
		assertEquals(22, p.getIdade());
		assertEquals("Capricórnio", p.getSigno());
	}

	@Test
	public void testeTres() {
		p = new Pessoa("10/06/2010");
		assertEquals(10, p.getIdade());
		assertEquals("Gêmeos", p.getSigno());
	}
}
