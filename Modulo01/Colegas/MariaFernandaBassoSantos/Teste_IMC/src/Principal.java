
public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(60, 1.64);
		Paciente paciente2 = new Paciente(60.4, 1.86);
		Paciente paciente3 = new Paciente(110, 1.84);
		
		System.out.println("Paciente 1: IMC = " + paciente1.calcularIMC() + " Diagnóstico = " + paciente1.diagnostico());
		System.out.println("Paciente 2: IMC = " + paciente2.calcularIMC() + " Diagnóstico = " + paciente2.diagnostico());
		System.out.println("Paciente 3: IMC = " + paciente3.calcularIMC() + " Diagnóstico = " + paciente3.diagnostico());
	}

}
