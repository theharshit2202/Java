package Lec_03;

public class Pattern_6 {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			
			for (int spaces = 1; spaces <= 2*(i-1); spaces++)
				System.out.printf("  ");
			
			for (int stars = 1; stars <= n+1-i; stars++)
				System.out.printf("* ");

			System.out.println();
		}

	}

}
