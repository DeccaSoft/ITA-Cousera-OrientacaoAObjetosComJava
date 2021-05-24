package com.coursera.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

	public static int ingredienteTotal = 0;
	private double preco;
	private ArrayList<String> ingrediente = new ArrayList<String>();
	public static Map<String, Integer> mapaIngredientes = new HashMap<String, Integer>();

	public ArrayList<String> getIngrediente() {
		return ingrediente;
	}

	public static String getListaIngredientes() {
		return mapaIngredientes.toString();
	}

	// adiciona ingredientes
	public void adicionaIngrediente(String ingrediente) {
		this.ingrediente.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}

	// pega o preço
	public double getPreco() {
		if (ingrediente.size() <= 2) {
			preco = 15;
		}
		if (ingrediente.size() >= 3 && ingrediente.size() <= 5) {
			preco = 20;
		}
		if (ingrediente.size() > 5) {
			preco = 23;
		}
		return preco;
	}

	// contabiliza os ingredientes
	public static void contabilizaIngrediente(String ingrediente) {
		if (mapaIngredientes.containsKey(ingrediente)) {
			int value = mapaIngredientes.get(ingrediente);
			mapaIngredientes.put(ingrediente, value + 1);
		} else {
			mapaIngredientes.put(ingrediente, 1);
		}
		ingredienteTotal++;

	}

	public static void zeraIngredientes() {
		ingredienteTotal = 0;
	}

}
