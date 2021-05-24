package br.com.mario;

/**
 * Util
 */
public class Util {

    /**
     * Função responsavel por gerar um numero randomico a partir da quantidade
     * palavras
     *
     * @param min
     * @param max
     * @return
     */
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }
}