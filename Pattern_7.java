package Lec_03;

public class Pattern_7 {
	public static void main(String[] args) {
		int n =5;
		int row =1;
		
		while(row<=n)
		{
			if(row==1 || row==n)
			{
				for(int i=1; i<=n;i++)
					System.out.print("* ");
			}
			else {
				System.out.print("* ");
				for(int i=2; i<=n-1;i++)
					System.out.print("  ");
				System.out.print("* ");

			}
			row++;
			System.out.println();
		}
	}

}
