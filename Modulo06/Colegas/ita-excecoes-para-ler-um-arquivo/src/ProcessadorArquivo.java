import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ProcessadorArquivo {
	
	private static String getCaminhoArquivo(String nome) {
		String s = System.getProperty("user.dir");
		s += System.getProperty("file.separator");
		s += "src";
		s += System.getProperty("file.separator");
		s += nome;
		
		return s;
	}
	
	private static void alimentarHashMap(String[] dadosLidos, HashMap<String,String> hm) {
		hm.put(dadosLidos[0], dadosLidos[1]);
	}
	
	@SuppressWarnings("resource")
	public static HashMap<String,String> processar(String nome) 
			throws LeituraArquivoException, IOException
	{
		HashMap<String,String> hm = null;
		try {		
			File f = new File(ProcessadorArquivo.getCaminhoArquivo(nome));
			Scanner s = new Scanner(f);
			hm = new HashMap<String,String>();
			String linhaLida;
			String[] dadosLidos = new String[2];
			
			try {
				if(!s.hasNextLine()) {
					throw new LeituraArquivoException("Arquivo vazio");
				}
			} catch (LeituraArquivoException e) {
				throw e;
			}
			
			while(s.hasNextLine()) {
				linhaLida = s.nextLine();
				dadosLidos = linhaLida.split("->");
				
				try {
					if(dadosLidos.length != 2) {
						throw new LeituraArquivoException("Formato de arquivo inválido");
					}
				} catch (LeituraArquivoException e) {
					throw e;
				}
				
				alimentarHashMap(dadosLidos, hm);
			}
			
			s.close();			
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo:\n"+e.getMessage());
		}
		return hm;
	}
	
}
