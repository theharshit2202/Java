package Lec_02;

import java.util.*;

public class Fibonaaci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0, b = 1, sum;
		System.out.print(a + "\n" + b + "\n");

		for (int i = 2; i < n; i++) {
			sum = a + b;
			//System.out.println(sum + " value of i : " + i);
			System.out.println(sum);
			a = b;
			b = sum;
		}
		scn.close();
	}
}
