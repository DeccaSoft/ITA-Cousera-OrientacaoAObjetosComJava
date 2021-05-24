package br.com.jose.mecanica;

import br.com.jose.dados.BancoDePalavras;

public class ErrouTerminou implements MecanicaDoJogo{

    private boolean mErrou = false;
    private BancoDePalavras mPalavras = new BancoDePalavras();
    private int mPalavrasCertas = 0;
    
    @Override
    public String getNome() {
        return "Errou perdeu!";
    }

    @Override
    public String getDescricao() {
        return "Se você errar a palavra o jogo termina!";
    }

    @Override
    public boolean isAcabou() {
        return mErrou;
    }

    @Override
    public String getPalavra() {
        return mPalavras.getNext();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            mPalavrasCertas++;
            return "Acertou. Parabéns!";
        }else{
            mErrou = true;
            return "Você e muito ruim mlk!!!";
        }
    }

    @Override
    public String getResultadoFinal() {
        return "\nTotal de pontos: " + mPalavrasCertas;
    }
    
}
