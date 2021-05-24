package com.coursera.interfaces;

public class Respeitoso implements FormatadorNome {

	private boolean masculino;
	private boolean feminino;

	public Respeitoso(boolean masculino, boolean feminino) {
		this.masculino = masculino;
		this.feminino = feminino;

	}

	public String formatarNome(String nome, String sobrenome) {

		if (masculino) {
			return "Sr. " + nome + " " + sobrenome;
		}
		if (feminino) {
			return "Sra. " + nome + " " + sobrenome;
		}
		
		return null;
	}

}
