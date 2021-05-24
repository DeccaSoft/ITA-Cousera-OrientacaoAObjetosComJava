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
	    		sign = "Capricórnio";
	    	else
	    		sign = "Aquário";
	    }
	    else if (month == 2) {
	    	if (day < 19)
	    		sign = "Aquário";
	    	else
	    		sign = "Peixes";
	    }
	    else if(month == 3) {
	    	if (day < 21)
	    		sign = "Peixes";
	    	else
	    		sign = "Áries";
	    }
	    else if (month == 4) {
	    	if (day < 20)
	    		sign = "Áries";
	    	else
	    		sign = "Touro";
	    }
	    else if (month == 5) {
	    	if (day < 21)
	    		sign = "Touro";
	    	else
	    		sign = "Gêmeos";
	    }
	    else if( month == 6) {
	    	if (day < 21)
	    		sign = "Gêmeos";
	    	else
	    		sign = "Câncer";
	    }
	    else if (month == 7) {
	    	if (day < 23)
	    		sign = "Câncer";
	    	else
	    		sign = "Leão";
	    }
	    else if( month == 8) {
	    	if (day < 23)
	    		sign = "Leão";
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
	    		sign = "Escorpião";
	    }
	    else if (month == 11) {
	    	if (day < 22)
	    		sign = "Escorpião";
	    	else
	    		sign = "Sagitário";
	    }
	    else if (month == 12) {
	    	if (day < 22)
	    		sign = "Sagitário";
	    	else
	    		sign ="Capricórnio";
	    }
	    return sign;
	}
}
