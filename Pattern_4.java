package Lec_03;

public class Pattern_4 {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			
			for (int spaces = 1; spaces <= n-i; spaces++)
				System.out.printf("  ");
			
			for (int stars = 1; stars <= i; stars++)
				System.out.printf("* ");

			System.out.println();
		}

	}

}
