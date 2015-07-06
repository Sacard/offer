package com.offer;

import java.util.Scanner;

public class MatrixUseScanner {
	private int m[][];
	private int m_rows;
	private int m_cols;
	private int num;

	public MatrixUseScanner(int[][] m, int m_rows, int m_cols, int num) {
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
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数组行数");
		int rows = s.nextInt();
		System.out.println("请输入数组列数");
		int cols = s.nextInt();
		int m[][] = new int[rows][cols];// 初始化数组
		System.out.println("请输入数组元素");
		for (int i = 0; i < rows; i++)
			// 循环输入
			for (int j = 0; j < cols; j++)
				m[i][j] = s.nextInt();
		System.out.println("请输入查找数字");
		int num = s.nextInt();
		MatrixUseScanner matrix = new MatrixUseScanner(m, rows, cols, num);
		System.out.println("查找结果:" + matrix.find());
	}
}
