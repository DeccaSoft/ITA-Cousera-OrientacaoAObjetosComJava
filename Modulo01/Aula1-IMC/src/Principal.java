
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(74, 1.70);
		Paciente p2 = new Paciente(58, 1.55);
		Paciente p3 = new Paciente(100, 1.35);
		
		System.out.println("Paciente 1: IMC = " + p1.calcularIMC() + " - Diagnóstico: " + p1.diagnostico());
		System.out.println("Paciente 2: IMC = " + p2.calcularIMC() + " - Diagnóstico: " + p2.diagnostico());
		System.out.println("Paciente 3: IMC = " + p3.calcularIMC() + " - Diagnóstico: " + p3.diagnostico());

	}

}
