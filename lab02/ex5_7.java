package hust.soict.vn.lab02;

import java.util.Scanner;

public class ex5_7 {
	public static void main(String args[]) {
		int row, column, x, y;
		Scanner in = new Scanner(System.in);

		System.out.println("Input number of rows of matrix");
		row = in.nextInt();
		System.out.println("Input number of columns of matrix");
		column = in.nextInt();

		int matrix1[][] = new int[row][column];
		int matrix2[][] = new int[row][column];
		int matrixSum[][] = new int[row][column];

		System.out.println("Input elements of first matrix");

		for (x = 0; x < row; x++)
			for (y = 0; y < column; y++)
				matrix1[x][y] = in.nextInt();

		System.out.println("Input the elements of second matrix");

		for (x = 0; x < row; x++)
			for (y = 0; y < column; y++)
				matrix2[x][y] = in.nextInt();

		for (x = 0; x < row; x++)
			for (y = 0; y < column; y++)
				matrixSum[x][y] = matrix1[x][y] + matrix2[x][y];

		System.out.println("Sum of the matrices:-");

		for (x = 0; x < row; x++) {
			for (y = 0; y < column; y++)
				System.out.print(matrixSum[x][y] + "\t");

			System.out.println();
		}
	}
}
