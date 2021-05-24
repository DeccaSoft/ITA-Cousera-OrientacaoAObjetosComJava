
public class Principal {

	public static void main(String[] args) {
		a(-100);
		System.out.println("Terminando main()...");
	}

	public static void a(int i) {
		System.out.println("Executando a() com " + i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("Tratando a Exceção: " + e.getMessage());;
		}
		System.out.println("Terminando a()...");
	}
	
	public static void b(int i) throws Exception {
		System.out.println("Executando b() com " + i);
		if(i<0) {
			throw new Exception("Exceção ocorrida em b() !");
			//System.out.println("Terminando o if em b()...");
		}
		System.out.println("Terminando b()...");
	}
}
