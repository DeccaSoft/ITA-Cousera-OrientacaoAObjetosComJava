package br.com.mario.mecanica;

import br.com.mario.Util;

public class FabricaMecanicaDoJogo {

    public MecanicaDoJogo getMecanicaDoJogo() {
        int ramdom = Util.getRandomNumber(0, 1);

        MecanicaDoJogo mecanicaDoJogo;

        if (ramdom == 0) {
            mecanicaDoJogo = new MecanicaJogoUm(5, 3, 2);
        } else {
            mecanicaDoJogo = new MecanicaJogoDois(10, 5, 3);
        }

        return mecanicaDoJogo;
    }
}
