
public class Provas {

	public static void main(String[] args) {

		public static double calcularSalario(Funcionario f){
			 double semImposto = f.salarioBruto()*(1-f.aliquotaImposto());
			 return semImposto + f.bonus();
			}
	}

}
