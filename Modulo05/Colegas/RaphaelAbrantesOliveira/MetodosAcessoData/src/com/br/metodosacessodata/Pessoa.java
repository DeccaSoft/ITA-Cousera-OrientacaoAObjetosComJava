/**
 * 
 */
package com.br.metodosacessodata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Raphael
 *
 */
public class Pessoa {

	private Date dataDeNascimento;

	public Pessoa(String str) {
		int dia = Integer.parseInt(str.split("/")[0]);
		int mes = Integer.parseInt(str.split("/")[1]);
		int ano = Integer.parseInt(str.split("/")[2]);
		String data = dia + "/" + mes + "/" + ano;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dataDeNascimento = formato.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		LocalDate nascimento = (this.dataDeNascimento.toInstant().atZone(ZoneId.systemDefault())).toLocalDate();
		LocalDate atual = LocalDate.now();
		return Period.between(nascimento, atual).getYears();
	}

	public String getSigno() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-03:00"));
		cal.setTime(this.dataDeNascimento);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = cal.get(Calendar.MONTH) + 1;
		switch (mes) {
		case 1:
			if (dia < 21) {
				return "Capricórnio";
			} else {
				return "Aquário";
			}
		case 2:
			if (dia < 20) {
				return "Aquário";
			} else {
				return "Peixes";
			}
		case 3:
			if (dia < 21) {
				return "Peixes";
			} else {
				return "Áries";
			}
		case 4:
			if (dia < 21) {
				return "Áries";
			} else {
				return "Touro";
			}
		case 5:
			if (dia < 21) {
				return "Touro";
			} else {
				return "Gêmeos";
			}
		case 6:
			if (dia < 21) {
				return "Gêmeos";
			} else {
				return "Câncer";
			}
		case 7:
			if (dia < 22) {
				return "Câncer";
			} else {
				return "Leão";
			}
		case 8:
			if (dia < 23) {
				return "Leão";
			} else {
				return "Virgem";
			}
		case 9:
			if (dia < 23) {
				return "Virgem";
			} else {
				return "Libra";
			}
		case 10:
			if (dia < 23) {
				return "Libra";
			} else {
				return "Escorpião";
			}
		case 11:
			if (dia < 22) {
				return "Escorpião";
			} else {
				return "Sagitário";
			}
		case 12:
			if (dia < 22) {
				return "Sagitário";
			} else {
				return "Capricórnio";
			}
		default:
			return null;
		}
	}
}
