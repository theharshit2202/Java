package Lec_03;

public class Pattern_1_while_loop {
public static void main(String[] args) {
	int n =5;
	int row=1;
	int tst=5;
	while(row<=n)
	{
			
		int cst=0;
		while(cst<tst)
		{
			System.out.print("* ");
			cst++;
		}
		row++;
		
		System.out.println();
	}
}
}
