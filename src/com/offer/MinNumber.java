package com.offer;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数组长度：");
		int n = in.nextInt();
		System.out.println("请输入数组：");
		int[] iNumbers = new int[n];
		for (int i = 0; i < n; i++) {
			iNumbers[i] = in.nextInt();
		}
		Number[] numbers = new Number[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = new Number(iNumbers[i]);
		}
		Arrays.sort(numbers);
		String minNumber = "";
		for (int i = 0; i < n; i++) {
			minNumber += numbers[i].getiNumber();
		}
		System.out.println("最小数是：" + minNumber);

	}

}

class Number implements Comparable<Number> {
	private int iNumber;

	public int getiNumber() {
		return iNumber;
	}

	public void setiNumber(int iNumber) {
		this.iNumber = iNumber;
	}

	public Number(int iNumber) {

		this.iNumber = iNumber;
	}

	@Override
	public int compareTo(Number number) {
		if (("" + iNumber + number.iNumber).compareTo("" + number.iNumber
				+ iNumber) == 0) {
			return 0;
		} else if (("" + iNumber + number.iNumber).compareTo(""
				+ number.iNumber + iNumber) > 0) {
			return 1;
		} else {
			return -1;
		}

	}
}