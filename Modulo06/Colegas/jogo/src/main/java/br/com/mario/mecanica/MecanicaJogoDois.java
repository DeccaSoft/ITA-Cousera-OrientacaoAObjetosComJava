package br.com.mario.mecanica;

import br.com.mario.embaralhador.Embaralhador;
import br.com.mario.embaralhador.FabricaEmbaralhadores;

/**
 * MecanicaJogoDois
 */
public class MecanicaJogoDois implements MecanicaDoJogo {

    private final FabricaEmbaralhadores fabricaEmbaralhadores;
    private int numeroMaximoAcertos;
    private int numeroMaximoErros;
    private int numeroMaximoTentativasPalavra;
    private int numeroAcerto = 0;
    private int numeroErro = 0;
    private int numeroDeTentativa = 0;

    public MecanicaJogoDois(int numeroMaximoAcertos, int numeroMaximoErros, int numeroMaximoTentativasPalavra) {
        this.numeroMaximoAcertos = numeroMaximoAcertos;
        this.numeroMaximoErros = numeroMaximoErros;
        this.numeroMaximoTentativasPalavra = numeroMaximoTentativasPalavra;
        this.fabricaEmbaralhadores = new FabricaEmbaralhadores();
    }

    @Override
    public boolean acabou() {
        return (numeroAcerto == numeroMaximoAcertos || numeroErro == numeroMaximoErros);
    }

    @Override
    public boolean acertou(String palavra, String resposta) {
        if (resposta.equalsIgnoreCase(palavra)) {
            numeroAcerto++;
            numeroDeTentativa = 0;
            return true;
        } else {
            numeroErro++;
            return false;
        }

    }

    @Override
    public boolean podeExecutarNovamente() {
        if (numeroDeTentativa <= numeroMaximoTentativasPalavra) {
            numeroErro--;
            numeroDeTentativa++;
            return true;
        } else {
            numeroDeTentativa = 0;
            return false;
        }
    }

    @Override
    public int pontuacaoFinal() {
        return numeroAcerto;
    }

    @Override
    public int numeroErros() {
        return numeroErro;
    }

    @Override
    public int numeroAcertos() {
        return numeroAcerto;
    }

    @Override
    public void acrescentaNumeroTentativa() {
        numeroDeTentativa++;
    }

    @Override
    public Embaralhador getEmbaralhador() {
        return fabricaEmbaralhadores.getEmbaralhadorAleatorio();
    }
}