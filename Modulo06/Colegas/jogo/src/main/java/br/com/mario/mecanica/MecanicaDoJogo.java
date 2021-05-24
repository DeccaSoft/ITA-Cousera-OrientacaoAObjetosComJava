package br.com.mario.mecanica;

import br.com.mario.embaralhador.Embaralhador;

public interface MecanicaDoJogo {

    boolean acabou();

    boolean acertou(String palavra, String resposta);

    boolean podeExecutarNovamente();

    int pontuacaoFinal();

    int numeroErros();

    int numeroAcertos();

    void acrescentaNumeroTentativa();

    Embaralhador getEmbaralhador();
}
