package com.offer;

import java.util.Scanner;

public class SpaceInString {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(s.replace(" ", "%20"));
	}
}
