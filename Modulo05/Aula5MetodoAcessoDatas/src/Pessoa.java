import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

/*
 * author Andr� Morais de Azevedo
 * date 22/08/2020 21:49
 */
public class Pessoa {

	private LocalDate dataDeNascimento;

	public Pessoa(String dataDeNascimento) {
		this.dataDeNascimento = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade() {
		return Period.between(dataDeNascimento, LocalDate.now()).getYears();
	}
	
	public String getSigno() {
		int dia = dataDeNascimento.getDayOfMonth();
		int mes = dataDeNascimento.getMonthValue();
		
		String signo="";
		
		if((mes == 3 && (dia >=21 && dia <= 31)) || (mes == 4 && (dia >=1 && dia <= 20))){
			signo = "Áries";
		}else if((mes == 4 && (dia >=21 && dia <= 30)) || (mes == 5 && (dia >=1 && dia <= 20))) {
			signo = "Touro";
		}else if((mes == 5 && (dia >=21 && dia <= 31)) || (mes == 6 && (dia >=1 && dia <= 20))) {
			signo = "Gêmeos";
		}else if((mes == 6 && (dia >=21 && dia <= 30)) || (mes == 7 && (dia >=1 && dia <= 20))) {
			signo = "Câncer";
		}else if((mes == 7 && (dia >=22 && dia <= 31)) || (mes == 8 && (dia >=1 && dia <= 22))) {
			signo = "Leão";
		}else if((mes == 8 && (dia >=23 && dia <= 31)) || (mes == 9 && (dia >=1 && dia <= 22))) {
			signo = "Virgem";
		}else if((mes == 9 && (dia >=23 && dia <= 30)) || (mes == 10 && (dia >=1 && dia <= 22))) {
			signo = "Libra";
		}else if((mes == 10 && (dia >=23 && dia <= 31)) || (mes == 11 && (dia >=1 && dia <= 21))) {
			signo = "Escorpião";
		}else if((mes == 11 && (dia >=22 && dia <= 30)) || (mes == 12 && (dia >=1 && dia <= 21))) {
			signo = "Sagitário";
		}else if((mes == 12 && (dia >=22 && dia <= 31)) || (mes == 1 && (dia >=1 && dia <= 20))) {
			signo = "Capricórnio";
		}else if((mes == 1 && (dia >=21 && dia <= 31)) || (mes == 2 && (dia >=1 && dia <= 19))) {
			signo = "Aquário";
		}else if((mes == 2 && (dia >=20 && dia <= 29)) || (mes == 3 && (dia >=1 && dia <= 20))) {
			signo = "Peixes";
		}
	    return signo;
	}
}
