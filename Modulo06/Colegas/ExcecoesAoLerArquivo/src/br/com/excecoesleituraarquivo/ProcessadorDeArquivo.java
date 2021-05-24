/**
 * 
 */
package br.com.excecoesleituraarquivo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Raphael
 *
 */
public class ProcessadorDeArquivo {

	@SuppressWarnings("resource")
	public static HashMap<String, String> processar(String arquivo) {
		String linha;
		String[] membros;
		HashMap<String, String> processado = new HashMap<String, String>();
		File file = new File(arquivo);
		Scanner sc;
		if (file.length() == 0) {
			throw new LeituraArquivoException("Arquivo vazio.");
		} else {
			try {
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
					linha = sc.nextLine();
					membros = linha.split("->");
					if (membros.length < 2 || membros.length > 2) {
						throw new LeituraArquivoException("Formato de arquivo inválido.");
					} else {
						processado.put(membros[0], membros[1]);
					}
				}
			} catch (IOException e) {
				throw new LeituraArquivoException("Erro ao abrir o arquivo." + e);
			}
		}
		return processado;
	}
}
