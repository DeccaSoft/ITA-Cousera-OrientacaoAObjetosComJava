package com.br.calculoimc;
import java.util.Random;

/**
 * 
 */

/**
 * @author Raphael
 *
 */
public class Principal {
	
	public static void main(String[] args) {

		Paciente p1 = new Paciente(30 + (new Random().nextDouble() * (150 - 30)), 1.3 + (new Random().nextDouble() * (2.2 - 1.3)));
		Paciente p2 = new Paciente(30 + (new Random().nextDouble() * (150 - 30)), 1.3 + (new Random().nextDouble() * (2.2 - 1.3)));;
		Paciente p3 = new Paciente(30 + (new Random().nextDouble() * (150 - 30)), 1.3 + (new Random().nextDouble() * (2.2 - 1.3)));;
		System.out.printf("Paciente 1: peso %.2fkg e altura %.2fm\nIMC = %.2f\n" + p1.diagnostico(),p1.getPeso(),p1.getAltura(),p1.calcularIMC());
		System.out.printf("\n\nPaciente 2: peso %.2fkg e altura %.2fm\nIMC = %.2f\n" + p2.diagnostico(),p2.getPeso(),p2.getAltura(),p2.calcularIMC());
		System.out.printf("\n\nPaciente 3: peso %.2fkg e altura %.2fm\nIMC = %.2f\n" + p3.diagnostico(),p3.getPeso(),p3.getAltura(),p3.calcularIMC());
	}

}
