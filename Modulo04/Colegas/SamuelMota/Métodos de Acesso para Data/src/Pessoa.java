import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private Date dataDeNascimento;
	
	public Pessoa(String ddn) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		this.dataDeNascimento = sdf.parse(ddn);
	}
	
	private int calcIdade() throws ParseException {
		int age = 0;
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataDeNascimento);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		LocalDate ld = LocalDate.of(year, month, date);
		
		Relogio agora = new Relogio("16/7/2020"); // RELOGIO DATA FIXA PARA TESTES
		//Relogio agora = new Relogio(); // RELOGIO DATA ATUAL
		
		Period diff = Period.between(ld, agora.agora());
		
		age = diff.getYears();
		
		return age;
	}
	
	private String calcSigno() {
		String signo = null;
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataDeNascimento);
		
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
				
		
		if (day >= 22 && month == 12 || day <= 20 && month == 1 ) {
			signo = "Capricórnio";
		} else if (day >= 21 && month == 1 || day <= 19 && month == 2 ) {
			signo = "Aquário";
		} else if (day >= 20 && month == 2 || day <= 20 && month == 3 ) {
			signo = "Peixes";			
		} else if (day >= 21 && month == 3 || day <= 20 && month == 4 ) {
			signo = "Áries";
		} else if (day >= 21 && month == 4 || day <= 20 && month == 5 ) {
			signo = "Touro";
		} else if (day >= 21 && month == 5 || day <= 20 && month == 6 ) {
			signo = "Gêmeos";
		} else if (day >= 21 && month == 6 || day <= 21 && month == 7 ) {
			signo = "Câncer";
		} else if (day >= 22 && month == 7 || day <= 22 && month == 8 ) {
			signo = "Leão";
		} else if (day >= 23 && month == 8 || day <= 22 && month == 9 ) {
			signo = "Virgem";
		} else if (day >= 23 && month == 9 || day <= 22 && month == 10 ) {
			signo = "Libra";
		} else if (day >= 23 && month == 10 || day <= 21 && month == 11 ) {
			signo = "Escorpião";
		} else if (day >= 22 && month == 11 || day <= 21 && month == 12 ) {
			signo = "Sagitário";
		}
		
		return signo;
	}

	
	public String getSigno() throws ParseException {
		
		return calcSigno();
	}

	public int getIdade() throws ParseException {
		
		return calcIdade();
	}

	
//	@Override
//	public String toString() {
//		return this.age + " anos";
//	}
}
