import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Relogio {

	private LocalDate dataAtualOuFixa;
	
	public Relogio() {
		//this.dataAtualOuFixa = new Date(System.currentTimeMillis());
		this.dataAtualOuFixa = LocalDate.now();
	}


	public Relogio(String dataFixa) throws ParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
		this.dataAtualOuFixa = LocalDate.parse(dataFixa, formatter);
	}

	
	public LocalDate agora() {
		
		return dataAtualOuFixa;
				
	}
}