
public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.bim1 = 70;
		a1.bim2 = 60;
		a1.bim3 = 80;
		a1.bim4 = 70;
		
//		System.out.println(VerificadoraNotas.mediaAluno(a1));
//		System.out.println(VerificadoraNotas.passouDeAno(a1));
		System.out.println(a1.media());
		System.out.println(a1.passouDeAno());
	}

}
