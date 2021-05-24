package br.com.mario;

import br.com.mario.mecanica.FabricaMecanicaDoJogo;
import br.com.mario.mecanica.MecanicaDoJogo;

import java.util.Scanner;

public class Principal {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MecanicaDoJogo mecanicaJogo = new FabricaMecanicaDoJogo().getMecanicaDoJogo();
        BancoDePalavras bancoPalavras = new BancoDePalavras();
        System.out.println("*********Vamos Inciar o jogo*********");

        do {
            if (!mecanicaJogo.acabou()) {
                String palavra = bancoPalavras.getPalavraAleatoria();
                String palavraEmbaralhada = mecanicaJogo.getEmbaralhador().embaralhar(palavra);

                System.out.println("========================PONTUAÇÃO ATUAL===============================");
                System.out.println("Você tem " + mecanicaJogo.numeroAcertos() + " acertos.");
                System.out.println("Você tem " + mecanicaJogo.numeroErros() + " erros.");
                System.out.println("======================================================================");

                System.out.println("Descubra qual é a palavra: " + palavraEmbaralhada);
                String resposta = scanner.nextLine();

                if (!resposta.isEmpty()) {
                    if (mecanicaJogo.acertou(palavra, resposta)) {
                        System.out.println("Parabéns você acertou!");
                    } else {

                        while (mecanicaJogo.podeExecutarNovamente()) {
                            System.out.println("Que pena, você errou. Tente novamente!");
                            System.out.println("Descubra qual é a palavra: " + palavraEmbaralhada);
                            String respostaTentativa = scanner.nextLine();

                            if (mecanicaJogo.acertou(palavra, respostaTentativa)) {
                                System.out.println("Parabéns você acertou!");
                                break;
                            } else {
                                mecanicaJogo.acrescentaNumeroTentativa();
                            }
                        }
                    }
                } else {
                    System.out.println("Digite sua resposta novamente!");
                }
            }else{
                System.out.println("Jogo acabou!");
            }

        } while (!mecanicaJogo.acabou());

        System.out.println("========================PONTUAÇÃO FINAL===============================");
        System.out.println("Você teve " + mecanicaJogo.numeroAcertos() + " acertos.");
        System.out.println("Você teve " + mecanicaJogo.numeroErros() + " erros.");
        System.out.println("======================================================================");

    }
}
