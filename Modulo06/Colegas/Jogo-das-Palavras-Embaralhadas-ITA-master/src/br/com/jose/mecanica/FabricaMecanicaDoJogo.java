package br.com.jose.mecanica;

public class FabricaMecanicaDoJogo {
 
    private static MecanicaDoJogo mMecanica;
    
    public static MecanicaDoJogo get() {
        return  mMecanica;
    }

    public static void set(MecanicaDoJogo mecanicaDoJogo) {
        FabricaMecanicaDoJogo.mMecanica = mecanicaDoJogo;
    }

}
