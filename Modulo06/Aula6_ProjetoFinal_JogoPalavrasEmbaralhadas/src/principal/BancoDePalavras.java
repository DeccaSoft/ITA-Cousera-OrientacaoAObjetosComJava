/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 15:43
 */
package principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDePalavras {

    private LeitoraDeArquivo palavras = new LeitoraDeArquivo();
    private List<String> listaDePalavras = new ArrayList<>();
    
    public String getNext(){
        try {
            listaDePalavras = palavras.getPalavraArquivo();
        } catch (IOException e) {
        	Logger.getLogger(BancoDePalavras.class.getName()).log(Level.SEVERE, null, e);
        }
        //Sorteia a pr�xima palavra
        Random randomico = new Random(System.currentTimeMillis());
        return  listaDePalavras.get(Math.abs(randomico.nextInt() % getTamanho()));
    }
    
    public int getTamanho(){
        return listaDePalavras.size();
    }
}
