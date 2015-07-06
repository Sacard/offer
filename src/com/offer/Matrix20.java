package com.offer;

import java.util.Scanner;

public class Matrix20 {
	private int rows;
	private int cols;

	public Matrix20(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
	}

	public void printMatrixInCircle(int[][] matrix) {
		if (rows < 1 || cols < 1) {
			return;
		}
		int start = 0;
		while (rows > start * 2 && cols > start * 2) {
			PrintMatrixInOneCircle(matrix, start);
			start++;
		}

	}

	private void PrintMatrixInOneCircle(int[][] matrix, int start) {
		for (int i = start; i < cols - start; i++) {
			System.out.print(matrix[start][i] + "--");
		}
		if (rows - start * 2 - 1 > 0) {
			for (int i = start + 1; i < rows - start; i++) {
				System.out.print(matrix[i][cols - start - 1] + "--");
			}
		}
		if (cols - start * 2 - 1 > 0) {
			for (int i = cols - start - 2; i > start - 1; i--) {
				System.out.print(matrix[rows - start - 1][i] + "--");
			}
		}
		if (rows - start * 2 - 2 > 0) {
			for (int i = rows - start - 2; i > start; i--) {
				System.out.print(matrix[i][start] + "--");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入矩阵的行数：");
		int rows = in.nextInt();
		System.out.println("请输入矩阵的列数：");
		int cols = in.nextInt();
		int[][] matrix = new int[rows][cols];
		System.out.println("请输入矩阵：");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		Matrix20 matrix20 = new Matrix20(rows, cols);
		matrix20.printMatrixInCircle(matrix);
	}
}
