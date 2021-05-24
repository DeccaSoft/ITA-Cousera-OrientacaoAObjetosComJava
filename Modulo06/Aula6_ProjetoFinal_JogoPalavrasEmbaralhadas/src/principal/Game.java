/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 15:36
 */

package principal;

import java.util.Scanner;

import embaralhador.Embaralhador;
import embaralhador.FabricaEmbaralhadores;
import mecanicas.FabricaMecanicaDoJogo;
import mecanicas.MecanicaDoJogo;
import mecanicas.NivelDificil;
import mecanicas.NivelFacil;
import mecanicas.NivelMedio;

public class Game {

	public static void main(String[] args) throws InterruptedException {
		
        Scanner teclado = new Scanner(System.in);
        int opcao = 1;
        
        while(opcao >=1 && opcao <= 3) {
        	System.out.println("-----------------------------------------------------");
        	System.out.println("Olá... Bem Vindo ao Jogo das Palavras Embaralhadas!!!");
        	System.out.println("-----------------------------------------------------");
	        System.out.println("   Com qual a mecânica de jogo você deseja jogar?    ");
	        System.out.println("-----------------------------------------------------");
	        System.out.println("    1 - Nível Fácil... Até 20 Tentativas   ");
	        System.out.println("    2 - Nível Intermediário... 5 Tentativas          ");
	        System.out.println("    3 - Nível Difícil... Apenas UMA Tentativa        ");
	        System.out.println("    0 - Finaliza o Jogo...                           ");
	        System.out.println("-----------------------------------------------------");
	        System.out.print("Digite sua opção: ");
	        opcao = teclado.nextInt();
		    switch(opcao){
		         case 1:
		        	FabricaMecanicaDoJogo.setMecanica(new NivelFacil());
		        	opcao=0;
		            break;
		         case 2: 
		        	FabricaMecanicaDoJogo.setMecanica(new NivelMedio());
		        	opcao=0;
		            break;
		         case 3: 
		        	FabricaMecanicaDoJogo.setMecanica(new NivelDificil());
		        	opcao=0;
		            break;
		         case 0:
		        	 System.out.println("Fim de Jogo!!! Até a Próxima...");
		        	 System.exit(0);
		         default:
		        	System.err.println("ATENCÃO: Opção inválida! Tente novamente...");
		        	Thread.sleep(2000);
		        	opcao=1;
		        	break;
		    } 
        }
        System.out.println("");
        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanica();
        System.out.println("Ok... Você escolheu o nível: " + mecanica.getNivel());
        System.out.println("");
        System.out.println("Regras: " + mecanica.getRegras());
        System.out.println("");
        while(!mecanica.isOver()){
        	String palavra = mecanica.getPalavra();
        	Embaralhador embaralhador = FabricaEmbaralhadores.getRandom();
        	String PalavraEmbaralhada = embaralhador.embaralhaPalavra(palavra);
        	System.out.println("A palavra embaralhada é: " + PalavraEmbaralhada);
        	System.out.print("Digite aqui seu palpite: ");
        	String resposta = teclado.next().toUpperCase();
        	String resultado = mecanica.tentativa(palavra, resposta);
        	System.out.println("Resultado: " + resultado);
        }

        System.out.println(mecanica.getResultadoFinal());	
	    teclado.close();
	}
}
