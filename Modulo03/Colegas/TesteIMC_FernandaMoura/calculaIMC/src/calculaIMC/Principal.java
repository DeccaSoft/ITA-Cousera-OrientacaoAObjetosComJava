package calculaIMC;

public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(57, 1.75); // peso e altura. 
		Paciente p2= new Paciente (40, 1.55);
		Paciente p3= new Paciente(120, 1.90); 
		
		
	
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
	

	}

}
