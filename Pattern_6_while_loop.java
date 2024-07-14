package Lec_03;

public class Pattern_6_while_loop {
public static void main(String[] args) {
	int n = 5;
	int row = 1;
	int tsp = 0; //total_spaces
	int tst = n; //total_stars
	
	while(row<=n)
	{
		int csp = 0;	//current_spaces_printed
		while(csp<tsp)
		{
			System.out.printf("s ");
			csp++;

		}
		int cst = 0; //current_stars_printed
		while(cst<tst)
		{
			System.out.printf("* ");
			cst++;

		}
		tst--;
		tsp = tsp+2;
		row++;
		System.out.println();
	}
}
}
