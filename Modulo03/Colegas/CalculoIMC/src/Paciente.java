
public class Paciente {

	private double peso, altura, imc;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
		calcularIMC();
		diagnostico();
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void calcularIMC() {
		this.imc = getPeso() / Math.pow(getAltura(), 2);
	}

	public double getImc() {
		return imc;
	}

	public void diagnostico() {
		if (imc < 16)
			System.out.println("Baixo peso muito grave");
		else if (imc >= 16 && imc < 17)
			System.out.println("Baixo peso grave");
		else if (imc >= 17 && imc < 18.5)
			System.out.println("Baixo peso");
		else if (imc >= 18.5 && imc < 25)
			System.out.println("Peso normal");
		else if (imc >= 25 && imc < 30)
			System.out.println("Sobrepeso");
		else if (imc >= 30 && imc < 35)
			System.out.println("Obesidade grau I");
		else if (imc >= 35 && imc < 40)
			System.out.println("Obesidade grau II");
		else if (imc >= 40)
			System.out.println("Obesidade grau III (obesidade mórbida");
	}

}
