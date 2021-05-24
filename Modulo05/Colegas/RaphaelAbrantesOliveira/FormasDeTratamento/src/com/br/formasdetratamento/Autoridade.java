/**
 * 
 */
package com.br.formasdetratamento;

/**
 * @author Raphael
 *
 */
public class Autoridade {

	private String nome;
	private String sobrenome;
	private String sexo;
	private String titulo;
	private FormatadorNome formatadorNome;

	public Autoridade(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Autoridade(String nome, String sobrenome, String sexo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
	}

	public Autoridade(String nome, String sobrenome, String sexo, String titulo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTratamento(String tipo) {
		if (tipo.equals("informal")) {
			this.formatadorNome = new Informal();
			return formatadorNome.formatarNome(this.getNome(), this.getSobrenome());
		} else if (tipo.equals("respeitoso")) {
			this.formatadorNome = new Respeitoso(this.sexo);
			return formatadorNome.formatarNome(this.getNome(), this.getSobrenome());
		} else {
			this.formatadorNome = new ComTitulo(this.titulo);
			return formatadorNome.formatarNome(this.getNome(), this.getSobrenome());
		}
	}

	@Override
	public String toString() {
		return this.getNome() + " " + this.getSobrenome() + " " + (this.getSexo() != null ? sexo : "") + " "
				+ (this.getTitulo() != null ? titulo : "");
	}
}
