package br.com.jose.embaralhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FabricaEmbaralhadora {
    private static List<Embaralhador> mEmbaralhadores = new ArrayList<>();
    
    static{
        mEmbaralhadores.add(new PalavraTrocaParImpar());
        mEmbaralhadores.add(new PalavraInversa());
    }
    
    public static Embaralhador getRandom(){
        Random random = new Random(System.currentTimeMillis());
        int referencia = random.nextInt();
        int indice = referencia % mEmbaralhadores.size();
        
        return  mEmbaralhadores.get(Math.abs(indice));
    }
}
