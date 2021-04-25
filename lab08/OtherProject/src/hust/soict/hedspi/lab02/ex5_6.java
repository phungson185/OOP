package hust.soict.hedspi.lab02;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ex5_6 {
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String el;
		String size = JOptionPane.showInputDialog("Enter the number of elements in the array: ");
		for (int i = 0; i < Integer.parseInt(size); i++) {
			el = JOptionPane.showInputDialog("Enter a number: ");
			arr.add(Integer.parseInt(el));
		}
		Collections.sort(arr);
		long sum = 0;
		for(int j = 0; j < arr.size(); j++)
		    sum += arr.get(j);
		System.out.print(sum+"\n");
		System.out.print(sum/arr.size()+"\n");
		System.out.print(arr.toString());
	}
}
