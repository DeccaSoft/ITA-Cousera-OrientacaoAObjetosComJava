package com.br.formasdetratamento.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.br.formasdetratamento.Autoridade;

public class TesteAutoridade {

	private Autoridade aut;

	@Test
	public void testeInstanciaSemSexoESemTitulo() {
		aut = new Autoridade("Jo�o", "Silva");
		assertEquals("Jo�o", aut.getTratamento("informal"));
		assertEquals(null, aut.getSexo());
		assertEquals(null, aut.getTitulo());
	}

	@Test
	public void testeInstanciaComSexoESemTitulo() {
		aut = new Autoridade("Rodrigo", "Baltar", "m");
		assertEquals("Rodrigo", aut.getTratamento("informal"));
		assertEquals("Sr. Baltar", aut.getTratamento("respeitoso"));
		assertEquals(null, aut.getTitulo());
	}

	@Test
	public void testeInstanciaComSexoEComTitulo() {
		aut = new Autoridade("Jacqueline", "Brazil", "F", "Magn�fica");
		assertEquals("Jacqueline", aut.getTratamento("informal"));
		assertEquals("Sra. Brazil", aut.getTratamento("respeitoso"));
		assertEquals("Magn�fica Brazil", aut.getTratamento("titulo"));
	}

}
