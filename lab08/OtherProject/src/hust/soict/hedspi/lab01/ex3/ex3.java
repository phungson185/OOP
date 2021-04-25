package hust.soict.hedspi.lab01.ex3;

import javax.swing.JOptionPane;

public class ex3 {
	public static void main(String args[]) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "Hi " + result + "!");
		System.exit(0);
	}
}
