import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		Map<String, String> teste = ProcessadorArquivo.processar("arquivo.txt");
		System.out.println("nome " + teste.get("nome"));
		System.out.println("sobrenome " + teste.get("sobrenome"));
		System.out.println("idade " + teste.get("idade"));
	}

}
