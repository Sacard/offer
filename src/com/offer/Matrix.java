package com.offer;

public class Matrix {
	private int m[][];
	private int m_rows;
	private int m_cols;
	private int num;

	public Matrix(int[][] m, int m_rows, int m_cols, int num) {
		this.m = m;
		this.m_rows = m_rows;
		this.m_cols = m_cols;
		this.num = num;
	}

	public boolean find() {
		return findNumFromMatrix(m_rows, m_cols);
	}

	public boolean findNumFromMatrix(int rows, int cols) {
		if (rows > 0 && cols > 0) {
			if (m[m_rows - rows][cols - 1] == num) {
				return true;
			} else if (m[m_rows - rows][cols - 1] > num) {
				return findNumFromMatrix(rows, cols - 1);
			} else {
				return findNumFromMatrix(rows - 1, cols);
			}
		} else
			return false;
	}

	public static void main(String[] args) {
		int m[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		int num = 7;
		Matrix matrix = new Matrix(m, m.length, m[0].length, num);
		System.out.println(matrix.find());
	}
}
