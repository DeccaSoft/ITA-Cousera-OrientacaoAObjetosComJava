/**
 * 
 */
package com.br.formasdetratamento;

/**
 * @author Raphael
 *
 */
public class ComTitulo implements FormatadorNome {

	private String titulo;

	public ComTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return this.getTitulo() + " " + sobrenome;
	}

}
