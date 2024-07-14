package Lec_03;

public class Patterm_5_while_loop {
public static void main(String[] args) {
	int n =5;
	int row = 1;
	int tsp = 0;
	int tst = n;
	
	while(row<=n)
	{
		int csp=0;
		while(csp<tsp)
		{
			System.out.print("  ");
			csp++;
		}
		
		int cst=0;
		while(cst<tst)
		{
			System.out.print("* ");
			cst++;
		}
		row++;
		tsp++;
		tst--;
		System.out.println();
	}
	
}
}
