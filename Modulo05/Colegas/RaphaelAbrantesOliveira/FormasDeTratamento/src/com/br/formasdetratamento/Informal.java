/**
 * 
 */
package com.br.formasdetratamento;

/**
 * @author Raphael
 *
 */
public class Informal implements FormatadorNome {

	public Informal() {
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return nome;
	}

}
