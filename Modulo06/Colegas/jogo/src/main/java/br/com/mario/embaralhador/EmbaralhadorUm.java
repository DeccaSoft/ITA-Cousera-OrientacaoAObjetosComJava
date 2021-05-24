package br.com.mario.embaralhador;

public class EmbaralhadorUm implements Embaralhador {

    @Override
    public String embaralhar(String palavra) {
        StringBuilder resultado = new StringBuilder(palavra);
        return resultado.reverse().toString();
    }
}
