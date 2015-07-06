package com.offer;

import java.util.Scanner;
import java.util.Stack;

public class Stack22 {
	public static boolean isPopOrder(int[] in, int[] out) {
		Stack<Integer> temp = new Stack<Integer>();
		int count = 0;

		for (int i = 0; i < out.length; i++) {
			boolean flag = false;
			for (int j = 0; j < in.length; j++) {
				if (in[j] == out[i]) {
					flag = true;
					if (temp.empty() == true) {
						for (int k = count; k < j; k++) {
							temp.add(in[k]);
							count = j + 1;
						}

					} else {
						if (temp.peek() == out[i]) {
							temp.pop();

						} else {
							if (count > j) {
								return false;
							} else {
								for (int k = count; k < j; k++) {
									temp.add(in[k]);
									count = j;

								}

							}
						}
					}
				}

			}
			if (flag == false) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÐòÁÐ³¤¶È£º");
		int n = s.nextInt();
		int[] in = new int[n];
		int[] out = new int[n];
		System.out.println("ÇëÊäÈëÑ¹ÈëË³Ðò£º");
		for (int i = 0; i < n; i++) {
			in[i] = s.nextInt();
		}
		System.out.println("ÇëÊäÈëµ¯³öË³Ðò£º");
		for (int i = 0; i < n; i++) {
			out[i] = s.nextInt();
		}
		System.out.println(Stack22.isPopOrder(in, out));
	}

}
