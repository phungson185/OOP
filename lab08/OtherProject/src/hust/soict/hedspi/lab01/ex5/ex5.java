package hust.soict.hedspi.lab01.ex5;

import javax.swing.JOptionPane;

public class ex5 {
	public static void main(String args[]) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, Double.parseDouble(strNum1) + Double.parseDouble(strNum2), "Sum", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, Double.parseDouble(strNum1) - Double.parseDouble(strNum2), "Difference", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, Double.parseDouble(strNum1) * Double.parseDouble(strNum2), "Product", JOptionPane.INFORMATION_MESSAGE);
		if (Double.parseDouble(strNum2) != 0) {
			JOptionPane.showMessageDialog(null, Double.parseDouble(strNum1) / Double.parseDouble(strNum2), "Quotient", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
