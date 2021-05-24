
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(111.55,1.67);
		p1.calcularIMC();
		p1.diagnostico();
		
		Paciente p2 = new Paciente(59.0,1.88);
		p2.calcularIMC();
		p2.diagnostico();
		
		Paciente p3 = new Paciente(65.0,1.50);
		p3.calcularIMC();
		p3.diagnostico();
	}
}
