import java.util.Scanner;

import entities.Paciente;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Paciente x = new Paciente();
		
		x.Peso = sc.nextDouble();
		x.Altura = sc.nextDouble();
		
		System.out.printf("%.2f %n", x.CalcularIMC(x.Peso, x.Altura));
		System.out.println(x.diagnostico(x.CalcularIMC(x.Peso, x.Altura)));
		
		sc.close();
	}

}
