public class Main{

    //Instanciando Pacientes...
    Paciente Um = new Paciente(76.56, 1.75);
    Paciente Dois = new Paciente(55, 1.85);
    Paciente Tres = new Paciente(125, 1.7);

    //Imprimindo no Console...
    public void ImprimeConsole(){
        System.out.println("Bem-vindo ao Cálculo de IMC");
        System.out.println("***************************");
        System.out.println(Paciente.diagnostico(Um));
        System.out.println(Paciente.diagnostico(Dois));
        System.out.println(Paciente.diagnostico(Tres));
        System.out.println("***************************");
        System.out.println("Fim da Execucao");}

    public static void main(String[]args){

        Main principal = new Main();
        principal.ImprimeConsole();

        }
}