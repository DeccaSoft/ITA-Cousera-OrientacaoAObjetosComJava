//import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private LocalDate dataDeNascimento;

	public Pessoa(String sDataDeNascimento) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(sDataDeNascimento, dateFormat);
		this.dataDeNascimento = date;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade() {
		LocalDate agora = LocalDate.now();
		Period idade = Period.between(dataDeNascimento, agora);
		return idade.getYears();
	}
	
	public String getSigno() {
		int month = dataDeNascimento.getMonthValue();
		int day = dataDeNascimento.getDayOfMonth();
		
		String sign="";
		
	    if (month == 1) {
	    	if (day < 20)
	    		sign = "Capric�rnio";
	    	else
	    		sign = "Aqu�rio";
	    }
	    else if (month == 2) {
	    	if (day < 19)
	    		sign = "Aqu�rio";
	    	else
	    		sign = "Peixes";
	    }
	    else if(month == 3) {
	    	if (day < 21)
	    		sign = "Peixes";
	    	else
	    		sign = "�ries";
	    }
	    else if (month == 4) {
	    	if (day < 20)
	    		sign = "�ries";
	    	else
	    		sign = "Touro";
	    }
	    else if (month == 5) {
	    	if (day < 21)
	    		sign = "Touro";
	    	else
	    		sign = "G�meos";
	    }
	    else if( month == 6) {
	    	if (day < 21)
	    		sign = "G�meos";
	    	else
	    		sign = "C�ncer";
	    }
	    else if (month == 7) {
	    	if (day < 23)
	    		sign = "C�ncer";
	    	else
	    		sign = "Le�o";
	    }
	    else if( month == 8) {
	    	if (day < 23)
	    		sign = "Le�o";
	    	else
	    		sign = "Virgem";
	    }
	    else if (month == 9) {
	    	if (day < 23)
	    		sign = "Virgem";
	    	else
	    		sign = "Libra";
	    }
	    else if (month == 10) {
	    	if (day < 23)
	    		sign = "Libra";
	    	else
	    		sign = "Escorpi�o";
	    }
	    else if (month == 11) {
	    	if (day < 22)
	    		sign = "Escorpi�o";
	    	else
	    		sign = "Sagit�rio";
	    }
	    else if (month == 12) {
	    	if (day < 22)
	    		sign = "Sagit�rio";
	    	else
	    		sign ="Capric�rnio";
	    }
	    return sign;
	}
}
