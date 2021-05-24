package br.com.mario.embaralhador;

import br.com.mario.Util;

public class FabricaEmbaralhadores {

    public Embaralhador getEmbaralhadorAleatorio() {
        int ramdom = Util.getRandomNumber(0, 1);

        Embaralhador embaralhador;
        if (ramdom == 0) {
            embaralhador = new EmbaralhadorUm();
            ;
        } else {
            embaralhador = new EmbaralhadorDois();
        }

        return embaralhador;
    }

}
