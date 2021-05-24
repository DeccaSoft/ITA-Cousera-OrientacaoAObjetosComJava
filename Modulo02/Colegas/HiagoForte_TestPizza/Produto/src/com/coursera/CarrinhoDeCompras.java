package com.coursera;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto, Integer> carrinho = new HashMap<>();
	private static int quantidadeNoCarrinho;
	private static double total = 0;

	// adicionando produtos
	public void adicionaProduto(Produto p, int quantidade) {
		if (carrinho.containsKey(p)) {
			carrinho.put(p, quantidade += quantidade);
		} else
			carrinho.put(p, quantidade);
		quantidadeNoCarrinho += quantidade;
	}

	// removendo produtos
	public void removeProduto(Produto p, int quantidade) {
		if (carrinho.containsKey(p)) {
			carrinho.remove(p);
			quantidadeNoCarrinho -= quantidade;
		}
	}

	// Retornando o Preço total do Carrinho
	public double getPrecoTotalCarrinho() {
		for (Produto p : carrinho.keySet()) {
			total = p.getPreco() * quantidadeNoCarrinho;
		}
		return total;
	}

	// Métodos acessores
	public HashMap<Produto, Integer> getCarrinho() {
		return (HashMap<Produto, Integer>) carrinho;
	}

	public void setCarrinho(HashMap<Produto, Integer> carrinho) {
		this.carrinho = carrinho;
	}

	public static int getQuantidadeNoCarrinho() {
		return quantidadeNoCarrinho;
	}

	public static void setQuantidadeNoCarrinho(int quantidadeNoCarrinho) {
		CarrinhoDeCompras.quantidadeNoCarrinho = quantidadeNoCarrinho;
	}

}
