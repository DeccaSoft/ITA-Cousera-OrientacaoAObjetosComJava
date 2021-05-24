/*
 * Week 1
 * Cálculo do IMC e classificação
 */

public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(34.0, 1.65);
		Paciente p2 = new Paciente(38.0, 1.50);
		Paciente p3 = new Paciente(150.7, 1.90);

		System.out.println("\n======= Paciente 1 =======");
		System.out.println("IMC = " + p1.calcularIMC() + " kg/mˆ2.");
		System.out.println("Classificação: " + p1.diagnostico());
	
		System.out.println("\n======= Paciente 2 =======");
		System.out.println("IMC = " + p2.calcularIMC() + " kg/mˆ2.");
		System.out.println("Classificação: " + p2.diagnostico());
		
		System.out.println("\n======= Paciente 3 =======");
		System.out.println("IMC = " + p3.calcularIMC() + " kg/mˆ2.");
		System.out.println("Classificação: " + p3.diagnostico());
	}

}
