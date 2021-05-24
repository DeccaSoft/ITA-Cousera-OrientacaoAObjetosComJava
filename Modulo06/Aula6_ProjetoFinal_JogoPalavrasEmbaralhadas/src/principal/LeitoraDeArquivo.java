/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 15:45
 */
package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitoraDeArquivo {

    private FileReader arquivo;
    private List<String> lista;

    public List<String> getPalavraArquivo() throws IOException{
        
        lista = new ArrayList<>();
        try{
            File arquivoPalavras = new File("palavras.txt");
            arquivo = new FileReader(arquivoPalavras);
            BufferedReader br = new BufferedReader(arquivo);
            String linha = br.readLine();
            while (linha != null) {
                lista.add(linha);
                linha = br.readLine(); 
            }
        }catch (IOException e) {
        	System.out.println("Erro ao ler arquivo contendo as palavras");
        }finally{
            arquivo.close();
        }  
        return lista;
    }
}
