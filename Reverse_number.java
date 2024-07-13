package Lec_03;

import java.util.*;

public class Reverse_number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int remainder, new_num=0;

		while (num > 0) {
			remainder = num % 10;
			new_num = new_num *10 + remainder ;
			num = num / 10;
		}
		System.out.println(new_num);
	}
}
