package hust.soict.hedspi.lab02;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ex5_5 {

	public static void main(String args[]) {

		String monthFull[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String monthAbbreviation[] = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.",
				"Nov.", "Dec." };
		String month3letter[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		String monthNumber[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		int check;
		String month = "";
		String year = "";
		int day = 0;
		do {
			check = 1;
			month = JOptionPane.showInputDialog("Enter month: ");
			if (!Arrays.asList(monthFull).contains(month) && !Arrays.asList(monthAbbreviation).contains(month)
					&& !Arrays.asList(month3letter).contains(month) && !Arrays.asList(monthNumber).contains(month)) {
				check = 0;
				continue;
			}
			year = JOptionPane.showInputDialog("Enter year: ");
			if (Integer.parseInt(year) < 1000 || Integer.parseInt(year) > 9999) {
				check = 0;
				continue;
			}
		} while (check == 0);

		switch (Integer.parseInt(month) + 1) {
		case 1:
			day = 31;
			break;
		case 2:
			if ((Integer.parseInt(year) % 400 == 0)
					|| ((Integer.parseInt(year) % 4 == 0) && (Integer.parseInt(year) % 100 != 0))) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		case 3:
			day = 31;
			break;
		case 4:
			day = 30;
			break;
		case 5:
			day = 31;
			break;
		case 6:
			day = 30;
			break;
		case 7:
			day = 31;
			break;
		case 8:
			day = 31;
			break;
		case 9:
			day = 30;
			break;
		case 10:
			day = 31;
			break;
		case 11:
			day = 30;
			break;
		case 12:
			day = 31;

		}
		System.out.print(day + " days\n");
	}
}
