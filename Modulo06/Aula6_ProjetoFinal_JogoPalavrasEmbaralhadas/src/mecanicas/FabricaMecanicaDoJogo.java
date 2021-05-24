/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 16:36
 */

package mecanicas;

public class FabricaMecanicaDoJogo {

    private static MecanicaDoJogo mecanica;
    
    public static MecanicaDoJogo getMecanica() {
        return  mecanica;
    }

    public static void setMecanica(MecanicaDoJogo mecanicaDoJogo) {
        FabricaMecanicaDoJogo.mecanica = mecanicaDoJogo;
    }
}
