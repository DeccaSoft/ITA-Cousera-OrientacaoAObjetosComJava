public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(85, 1.78);
		Paciente paciente2 = new Paciente(17, 1.05);
		Paciente paciente3 = new Paciente(66, 1.68);
		
		System.out.println("O IMC do paciente 1 �: " + paciente1.calcularIMC() + ".\nLogo sua faixa de IMC �: " + paciente1.diagnostico());
		System.out.println("\nO IMC do paciente 2 �: " + paciente2.calcularIMC() + ".\nLogo sua faixa de IMC �: " + paciente2.diagnostico());
		System.out.println("\nO IMC do paciente 3 �: " + paciente3.calcularIMC() + ".\nLogo sua faixa de IMC �: " + paciente3.diagnostico());
	}
}
