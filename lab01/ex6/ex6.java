package hust.soict.vn.lab01.ex6;

import javax.swing.JOptionPane;

public class ex6 {
	public static void main(String args[]) {
		String strNum1, strNum2, strNum3, result;

		strNum1 = JOptionPane.showInputDialog(null, "Please input a: ", "The first degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input b: ", "The first degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);

		double a = Double.parseDouble(strNum1);
		double b = Double.parseDouble(strNum2);

		// ax + b = 0

		if (a == 0 && b == 0) {
			result = "Equations with countless solutions";
		} else if (a == 0) {
			result = "The equation has no solution";
		} else {
			result = -b / a + "";
		}

		JOptionPane.showMessageDialog(null, result, "The first degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);

		strNum1 = JOptionPane.showInputDialog(null, "Please input a: ", "The first degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input b: ", "The first degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null, "Please input c: ", "The first degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);

		a = Double.parseDouble(strNum1);
		b = Double.parseDouble(strNum2);
		double c = Double.parseDouble(strNum3);

		// ax + by = c
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					result = "Equations with countless solutions";
				else
					result = "The equation has no solution";
			} else {
				result = "x is any and y = " + c / b;

			}

		} else {
			if (b == 0)
				result = "x = " + c / a + ", y is any";
			else {
				if (c == 0)
					result = "x is any and y = -" + a / b + "x";
				else
					result = "Equations with countless solutions";
			}
		}
		JOptionPane.showMessageDialog(null, result, "The first degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);

		strNum1 = JOptionPane.showInputDialog(null, "Please input a: ", "The second degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input b: ", "The second degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null, "Please input c: ", "The second degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);
		
		a = Double.parseDouble(strNum1);
		b = Double.parseDouble(strNum2);
		c = Double.parseDouble(strNum3);

		// ax^2 + bx + c = 0

		double delta = b * b - 4 * a * c;

		if (delta > 0) {
			double x1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
			double x2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
			result = x1 + " and " + x2;
		} else if (delta == 0) {
			double x = -b / (2 * a);
			result = x + "";
		} else {
			result = "The equation has no solution";
		}
		JOptionPane.showMessageDialog(null, result, "The second degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
