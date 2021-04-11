package hust.soict.hedspi.lab02;

import javax.swing.JOptionPane;

public class ex5_4 {
	public static void main(String args[]) {
		String n = JOptionPane.showInputDialog("Enter a number: ");
		int a = Integer.parseInt(n);
		for (int i = 0; i < a; i++) {
			for (int j = a - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
