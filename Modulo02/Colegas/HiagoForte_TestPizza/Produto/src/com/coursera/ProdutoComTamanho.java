package com.coursera;

public class ProdutoComTamanho extends Produto {

	private int tamanho;

	public ProdutoComTamanho(int codigo, String nome, double preco, int tamanho) {
		super(codigo, nome, preco);
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tamanho;
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ProdutoComTamanho))
			return false;
		ProdutoComTamanho outroProduto = (ProdutoComTamanho) object;

		if (this.hashCode() == outroProduto.hashCode()) {
			return true;
		} else {
			return false;
		}

	}

}
