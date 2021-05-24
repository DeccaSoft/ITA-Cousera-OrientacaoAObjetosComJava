public class Paciente {

    //declaração de variáveis
    double peso;
    double altura;

    //construtor parametrizado
    public Paciente(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    // método único que calcula o IMC e dá o diagnóstico
    public static String diagnostico (Paciente paciente){
        String frase = "IMC";
        double IMC = paciente.peso/(paciente.altura * paciente.altura);
            if(IMC < 16) frase = (IMC+" Baixo Peso: Muito Grave");
            else if(IMC >= 16 && IMC <= 16.99) frase = (IMC+" Baixo Peso: Grave");
            else if(IMC >= 17 && IMC <= 18.49) frase = (IMC+" Baixo Peso");
            else if(IMC >= 18.5 && IMC <= 24.99) frase = (IMC+" Baixo Normal");
            else if(IMC >= 25 && IMC <= 29.99) frase = (IMC+" Sobrepeso");
            else if(IMC >= 30 && IMC <= 34.99) frase = (IMC+" Obesidade Grau 1");
            else if(IMC >= 35 && IMC <= 39.99) frase = (IMC+" Obesidade Grau 2");
            else if(IMC >= 40) frase = (IMC+" Obesidade grau 3 (Mórbida)");
            return frase;
        }
    }