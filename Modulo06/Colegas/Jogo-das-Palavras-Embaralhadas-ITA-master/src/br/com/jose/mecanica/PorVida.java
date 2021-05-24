package br.com.jose.mecanica;

import br.com.jose.dados.BancoDePalavras;

public class PorVida implements MecanicaDoJogo{

    private int mQtdPalavrasErradas = 3;
    private BancoDePalavras mPalavras = new BancoDePalavras();
    private int mPontos = 0;
    
    @Override
    public String getNome() {
        return "Acerta o maior número de palavras sem morrer.";
    }

    @Override
    public String getDescricao() {
        return "A cada palavra errada vocÃª perderá uma vida, quando sua vida chegar a 0 o jogo termina.";
    }

    @Override
    public boolean isAcabou() {
        if(mQtdPalavrasErradas <= 0){
            return true;
        }
       return false;
    }

    @Override
    public String getPalavra() {
        return mPalavras.getNext();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            mPontos++;
            return "Você acertou, muito bem!.... Continue com o jogo!!!\n --> ++1 ponto <--";
        }else{
            mQtdPalavrasErradas--;
            return "Que pena você não conseguiu, mas podemos tentar outra palavra.\n -> Resta: " + mQtdPalavrasErradas + " vidas.";
        }
    }

    @Override
    public String getResultadoFinal() {
        
        String result = mPontos < 2 ? "\nVocê e muito ruim mlk!!!\n Total de pontos: " + mPontos : "\nParabéns: \n Total de pontos: " + mPontos;
        
        return result;
    }
    
}
