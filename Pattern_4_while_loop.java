package Lec_03;

public class Pattern_4_while_loop {
public static void main(String[] args) {
	int n =5;
	int row=1;
	int tsp=n-1;
	int tst=1;
	while(row<=n)
	{
		int csp =0;
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
		tst++;
		tsp--;
		System.out.println();
	}
}
}
