
public class LeituraArquivoException extends Exception {
	public LeituraArquivoException(String msg) {
		super(msg);
		System.out.println("Oops... "+msg);
	}
}
