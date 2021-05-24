/**
 * 
 */
package com.br.formasdetratamento;

/**
 * @author Raphael
 *
 */
public class Respeitoso implements FormatadorNome {

	private String sexo;

	public Respeitoso(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (this.getSexo().equals("m") || this.getSexo().equals("M")) {
			return "Sr. " + sobrenome;
		} else {
			return "Sra. " + sobrenome;
		}
	}

}
