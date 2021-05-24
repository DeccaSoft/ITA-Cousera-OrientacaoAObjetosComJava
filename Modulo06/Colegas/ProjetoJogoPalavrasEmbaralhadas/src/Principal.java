//Alexandre Luís Nunes Cardiga

import java.util.Scanner;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		String nivel,n;
		int tentativas=0;
		int pontos=0;
		boolean testapalavra = false;
		FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new FabricaMecanicaDoJogo();
		MecanicaDoJogo mecanicaDoJogo=null;
		
		Scanner sc = new Scanner(System.in);
		do{		
		   System.out.println("");
		   System.out.println("************ Palavras Embaralhadas ************");
	       System.out.println("   Jogo: Alexandre Luís Nunes Cardiga");
		   System.out.println("");
		   System.out.println("   Objetivo: descobrir qual é a palavra que está embaralhada");
		   System.out.println("");
		   System.out.println("");
	       System.out.println("--------------------------------------------------------------");
		   System.out.println("|  Muito Fácil: cada letra vale 2 pontos.                    |");
		   System.out.println("|  Difícil:     cada letra vale 4 pontos.                    |");
		   System.out.println("|  Pontuação depende do tamanho da palavra e nível escolhido.|");
		   System.out.println("--------------------------------------------------------------");
		   System.out.println("");
		   System.out.println("");
		   System.out.println("Informe nível:");
		   System.out.println("");
		   System.out.println("1 - Nível Difícil     (1 tentativa)");
		   System.out.println("5 - Nível Muito Fácil (5 tentativas)");
		   do{
			   nivel = sc.nextLine();
			   if (!nivel.equals("1") && !nivel.equals("5"))
				  System.out.println("Opção inválida. Digite novamente");
		     }while (!nivel.equals("1") && !nivel.equals("5"));
		   
		   tentativas=0;
		   pontos=0;
		   do{		 		     
		      switch (nivel)
		        {
		          case "1":
		           { mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanicaDoJogoUmaChance();
		             break;
		           }
		          case "5":
		           {
		    		 mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanicaDoJogoVidas();	
 		    		 break;
		           }
		        
		        }
			System.out.println("");
			System.out.println("Adivinhe a palavra...");		   
			String palavraEscolhida = mecanicaDoJogo.getPalavraEscolhidaAleatoria();
		    String palavraEmbaralhada =  mecanicaDoJogo.getPalavraEscolhidaEmbaralhada();
		    System.out.println(palavraEmbaralhada);
			System.out.println("Qual é a resposta:");
			testapalavra = mecanicaDoJogo.testaPalavra(sc.nextLine()); 
			if (testapalavra == true)
			  { System.out.println("Você acertou!! ");
				int numero =palavraEscolhida.length();
				mecanicaDoJogo.acerta(numero);
				pontos += mecanicaDoJogo.getPontos();
			  }
			else
			  { System.out.println("Errado!    Palavra correta: " + palavraEscolhida);
			    tentativas++;

			    System.out.println("Tentativa nº:              " + tentativas );
			  }
		   
		   }while(!mecanicaDoJogo.jogoTerminou(tentativas));	

		   System.out.println("");
		   System.out.println(">>>>>>>>> Pontuação: " + pontos + " pontos <<<<<<<<<");
		   System.out.println("");
		   System.out.println("");
		   System.out.println("Repetir o jogo?");
		   System.out.println("<S>im      <N>ão");
		   do{
			   n = sc.nextLine();
			   if(!(n.equals("S") || n.equals("s")) && !(n.equals("N") || n.equals("n")))
				  System.out.println("Opção inválida, tente novamente.");
				
		     }while(!(n.equals("S") || n.equals("s")) && !(n.equals("N") || n.equals("n")));		
		
		
		 }while((n.equals("S") || n.equals("s")));
		
		System.out.println(">>>>>>>> Jogo TERMINOU !!! <<<<<<<<<");
		sc.close();
		
	}
	

}
