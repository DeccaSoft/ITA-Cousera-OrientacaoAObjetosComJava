import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/*
 * @Author: André Morais de Azevedo
 * @DateTime: 31/08/20 14:20
 */

public class ProcessadorDeArquivo{

	public static HashMap<String, String> processar(String nomeArquivo) throws LeituraArquivoException, FileNotFoundException{
		//Retorna um map com as informações do arquivo lido
		//Formato: chave->valor
//Ex:		nome->Eduardo
//			sobrenome->Guerra
//			idade->35
		
		String linhaArquivo;
		String[] tokens;
		HashMap<String, String> informacoes = new HashMap<>();
		File file = new File(nomeArquivo);
		Scanner scanner = new Scanner(file);
		if (file.length() == 0) {
			throw new LeituraArquivoException("Atenção: O Arquivo está Vazio!!!");
		} else {
			try {
				//scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					linhaArquivo = scanner.nextLine();
					tokens = linhaArquivo.split("->");
					if (tokens.length < 2 || tokens.length > 2) {
					//if (!tokens.equals("->")) {
						throw new LeituraArquivoException("Atenção: O Arquivo NÃO tem um Formato Válido!!!");
					} else {
						informacoes.put(tokens[0], tokens[1]);
					}
				}
			} catch (IOException exc) {
				throw new LeituraArquivoException("Atenção: Não Consegui Abrir o Arquivo!!!" + exc);
			}
		}
		scanner.close();
		return informacoes;
	}
}
