package br.com.jose.mecanica;

import br.com.jose.dados.BancoDePalavras;

public class TodasAsPalavras implements MecanicaDoJogo{

    private static int mQtdPalavras = 0;
    private BancoDePalavras mPalavras = new BancoDePalavras();
    private String mPalavraVez = mPalavras.getNext();
    private int mPontos = 0;
    private int mResta = mPalavras.getTamanho();
    
    @Override
    public String getNome() {
        return "Acerta o maior número de palavras possiveis.";
    }

    @Override
    public String getDescricao() {
        return "Cada palavra certa você ganhara 10 de ponto e a cada palavra errada menos 5 pontos.";
    }

    @Override
    public boolean isAcabou() {
       return mQtdPalavras == mPalavras.getTamanho() ? true : false;
    }

    @Override
    public String getPalavra() {
        return mPalavraVez;
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            mPontos += 10;
            mQtdPalavras++;
            mPalavraVez = mPalavras.getNext();
            return "Você acertou, muito bem!.... Continue com o jogo!!!\n --> ++10 <-- " + "Falta " + (mResta -mQtdPalavras) + " palavras.";
        }else{
            mPontos -= 5;
            mQtdPalavras++;
            return "Que pena você não conseguiu, mas pode tanta de novo com a mesma palavra!\n --> -5 <-- " + "Falta " + (mResta - mQtdPalavras) + " palavras.";
        }
    }

    @Override
    public String getResultadoFinal() {
        
        String result = mPontos < 0 ? "\nVocê e muito ruim mlk!!!\n Total de pontos: " + mPontos : "\nParabéns: \n Total de pontos: " + mPontos;
        
        return result;
    }
    
}
