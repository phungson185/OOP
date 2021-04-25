package hust.soict.hedspi.aims.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
   
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 0)
			this.year = year;
	}

	public MyDate() {
		this.day = LocalDate.now().getDayOfMonth();
		this.month = LocalDate.now().getMonthValue();
		this.year = LocalDate.now().getYear();
	}

	public MyDate(int day, int month, int year) {
		if ((day >= 1 && day <= 31) || (month >= 1 && month <= 12) || (year >= 0)) {
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			if (!(day >= 1 && day <= 31))
				System.out.println("Invalid day");
			if (!(month >= 1 && month <= 12))
				System.out.println("Invalid month");
			if (year < 0)
				System.out.println("Invalid year");
		}
	}

	public MyDate(String date) {
		date = date.replaceAll("(.*?) (\\d+)(\\w+) (.*)", "$1 $2, $4");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate dateFormated = LocalDate.parse(date, formatter);
		this.day = dateFormated.getDayOfMonth();
		this.month = dateFormated.getMonthValue();
		this.year = dateFormated.getYear();
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date (dd-mm-yyyy) : ");
		String date = sc.nextLine();
		String result[] = date.split("-");
		setDay(Integer.parseInt(result[0]));
		setMonth(Integer.parseInt(result[1]));
		setYear(Integer.parseInt(result[2]));
	}

	public void print() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
	}
}
