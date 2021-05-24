//Alexandre Lu�s Nunes Cardiga

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
	       System.out.println("   Jogo: Alexandre Lu�s Nunes Cardiga");
		   System.out.println("");
		   System.out.println("   Objetivo: descobrir qual � a palavra que est� embaralhada");
		   System.out.println("");
		   System.out.println("");
	       System.out.println("--------------------------------------------------------------");
		   System.out.println("|  Muito F�cil: cada letra vale 2 pontos.                    |");
		   System.out.println("|  Dif�cil:     cada letra vale 4 pontos.                    |");
		   System.out.println("|  Pontua��o depende do tamanho da palavra e n�vel escolhido.|");
		   System.out.println("--------------------------------------------------------------");
		   System.out.println("");
		   System.out.println("");
		   System.out.println("Informe n�vel:");
		   System.out.println("");
		   System.out.println("1 - N�vel Dif�cil     (1 tentativa)");
		   System.out.println("5 - N�vel Muito F�cil (5 tentativas)");
		   do{
			   nivel = sc.nextLine();
			   if (!nivel.equals("1") && !nivel.equals("5"))
				  System.out.println("Op��o inv�lida. Digite novamente");
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
			System.out.println("Qual � a resposta:");
			testapalavra = mecanicaDoJogo.testaPalavra(sc.nextLine()); 
			if (testapalavra == true)
			  { System.out.println("Voc� acertou!! ");
				int numero =palavraEscolhida.length();
				mecanicaDoJogo.acerta(numero);
				pontos += mecanicaDoJogo.getPontos();
			  }
			else
			  { System.out.println("Errado!    Palavra correta: " + palavraEscolhida);
			    tentativas++;

			    System.out.println("Tentativa n�:              " + tentativas );
			  }
		   
		   }while(!mecanicaDoJogo.jogoTerminou(tentativas));	

		   System.out.println("");
		   System.out.println(">>>>>>>>> Pontua��o: " + pontos + " pontos <<<<<<<<<");
		   System.out.println("");
		   System.out.println("");
		   System.out.println("Repetir o jogo?");
		   System.out.println("<S>im      <N>�o");
		   do{
			   n = sc.nextLine();
			   if(!(n.equals("S") || n.equals("s")) && !(n.equals("N") || n.equals("n")))
				  System.out.println("Op��o inv�lida, tente novamente.");
				
		     }while(!(n.equals("S") || n.equals("s")) && !(n.equals("N") || n.equals("n")));		
		
		
		 }while((n.equals("S") || n.equals("s")));
		
		System.out.println(">>>>>>>> Jogo TERMINOU !!! <<<<<<<<<");
		sc.close();
		
	}
	

}
