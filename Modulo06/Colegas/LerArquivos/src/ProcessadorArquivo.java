import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	
	public static Map<String, String> processar(String caminho){
		Map<String, String> retorno = new HashMap<>();
		try{
			FileReader arq = new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			String[] temp = null;
			
			if (linha == null) {
				throw new ArquivoVazioException("Arquivo Vazio ...");
			}
			
			while(linha != null){
				temp = linha.split("->"); 
				if(temp.length > 2) {
					throw new FormatoArquivoException("Formato de arquivo invalido ... ");
				}
				retorno.put(temp[0], temp[1]);
				linha = lerArq.readLine();
			}
			arq.close();

		} catch (IOException e){
			throw new LeituraArquivoException("Erro ao abrir o arquivo " + e.getMessage());
		}
        return retorno;
    }
	
}
