package br.com.mario.embaralhador;

import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class EmbaralhadorDois implements Embaralhador {

    @Override
    public String embaralhar(String palavra) {

        Stack<String> pares = new Stack<>();
        LinkedList<String> resultado = new LinkedList<>();

        char[] letras = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            if (i % 2 == 0) {
                pares.push(String.valueOf(letras[i]));
            } else {
                resultado.add(String.valueOf(letras[i]));
            }
        }

        int tamanhoPares = pares.size();
        for (int i = 0; i < tamanhoPares; i++) {
            resultado.add(pares.pop());
        }

        return resultado.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
