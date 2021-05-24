//Alexandre Luís Nunes Cardiga

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	static private ArrayList<String> palavras = new ArrayList<String>();
	private static final Path PATH_PREFIX = FileSystems.getDefault().getPath("arquivos");
	
	private void leitura()
	{
		try{
		    Path arquivo = PATH_PREFIX.resolve("listadepalavras.txt");
		    
		    FileReader arq = new FileReader(arquivo.toString());
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			
			palavras.clear();
			while(linha != null){
				palavras.add(linha);
				linha = lerArq.readLine();
			}

			arq.close();
		} catch (IOException e){
			System.err.println("Erro na abertura do arquivo: " + e.getMessage());
		}		
	}

	// Lista c/ palavras lidas do arquivo txt
	private ArrayList <String> getListaPalavras () 
	{
		this.leitura();
		return palavras; 

	}

	// Metodo retorna palavra aleatória do arquivo.txt
	public String getPalavraAleatoria () 
	{   
		ArrayList<String> palavrasCopia = (ArrayList<String>) getListaPalavras();
		Random r = new Random();
		int n = r.nextInt(palavrasCopia.size());
		return palavrasCopia.get(n);		
	}
	
}




