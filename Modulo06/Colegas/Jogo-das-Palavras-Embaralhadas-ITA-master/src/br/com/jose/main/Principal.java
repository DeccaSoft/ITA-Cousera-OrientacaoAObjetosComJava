package br.com.jose.main;

import br.com.jose.classes.complementares.JavaUtils;
import br.com.jose.embaralhador.Embaralhador;
import br.com.jose.embaralhador.FabricaEmbaralhadora;
import br.com.jose.mecanica.TodasAsPalavras;
import br.com.jose.mecanica.FabricaMecanicaDoJogo;
import br.com.jose.mecanica.MecanicaDoJogo;
import br.com.jose.mecanica.ErrouTerminou;
import br.com.jose.mecanica.PorVida;
import java.util.Scanner;

public class Principal extends JavaUtils{
	
	
    private static Scanner mOpcao;
	private static Scanner scanner;

	public static void main(String[] args){

        mOpcao = new Scanner(System.in);
        scanner = new Scanner(System.in);
        
        printLN("===============================================================");
        printLN("==================== ESCOLHA A MECÂNICA DO JOGO ===============");
        printLN("1 - Errou perdeu.");
        printLN("2 - O maior número de acertos.");
        printLN("3 - Três vida e o jogo termina.");
        printT("->");
        int opcao = mOpcao.nextInt();
	    switch(opcao){
	         case 1:
	            FabricaMecanicaDoJogo.set(new ErrouTerminou());
	            break;
	         case 2: 
	            FabricaMecanicaDoJogo.set(new TodasAsPalavras());
	            break;
	         case 3: 
	            FabricaMecanicaDoJogo.set(new PorVida());
	            break;
	         default:
	            printLN("Opção invalida, programa terminado");
	            System.exit(0);
	         break;
	   } 


        MecanicaDoJogo mecanicaDoJogo = FabricaMecanicaDoJogo.get();

        printLN("*=============================================================*");
        printLN("*=========================== START ===========================*");
        printLN("Você vai jogar no modo: " + mecanicaDoJogo.getNome());
        printT("Descrição: " + mecanicaDoJogo.getDescricao());
        
        espaco();
        
        while(!mecanicaDoJogo.isAcabou()){
            String palavra = mecanicaDoJogo.getPalavra();
            Embaralhador embaralhador = FabricaEmbaralhadora.getRandom();
            String embaralhada = embaralhador.embaralhar(palavra);
            
            printLN("Adivinhe a palavra: " + embaralhada);
            printT("-> ");
            String resposta = scanner.nextLine().toUpperCase();
            String resultado = mecanicaDoJogo.tentativa(palavra, resposta);
            printLN("Resultado: " + resultado);
        }
        
        printLN(mecanicaDoJogo.getResultadoFinal());
    }
}
