package br.com.mario;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class BancoDePalavras {
    private Scanner scanner;
    private Path path;
    private long numeroPalavras;

    public BancoDePalavras() {
        this.path = Paths.get(getFilePalavras().getAbsolutePath());
        this.numeroPalavras = getQuantidadePalavras(path);
    }

    public String getPalavraAleatoria() {
        abrirArquivo();
        String palavra = lerRegistros();
        fecharArquivo();
        return palavra;
    }

    private void fecharArquivo() {
        if (scanner != null) {
            scanner.close();
        }
    }

    /**
     * Função responsavel por abrir o arquivo txt
     */
    private void abrirArquivo() {

        try {
            scanner = new Scanner(path);
        } catch (IOException e) {
            System.out.println("Erro ao abrir arquivo");
            e.printStackTrace();
        }
    }

    /**
     * Função responsavel por recuperar uma palavra dentre as 20 posiveis
     *
     * @return
     */
    private String lerRegistros() {
        int numeroGerado = Util.getRandomNumber(1, (int) numeroPalavras);
        String palavraEncontrada = "";

        try {
            palavraEncontrada = Files.readAllLines(path).get(numeroGerado - 1);
            return palavraEncontrada;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Recupera o numero de palavras do arquivo
     *
     * @param path
     * @return
     */
    private long getQuantidadePalavras(Path path) {
        try {
            return Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Função responsavel por recuperar o arquivo das palavras
     *
     * @return
     */
    private File getFilePalavras() {
        return new File(getClass().getClassLoader().getResource("palavras.txt").getFile());
    }
}
