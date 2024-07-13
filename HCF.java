package Lec_02;

import java.util.*;

public class HCf {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int divisor = scn.nextInt();
	int divident = scn.nextInt();
	int remainder;
	
	while(true)
	{
		remainder = divident % divisor;
		if(remainder == 0 || remainder == 1)
		{
			System.out.println(divisor);
			break;
		}
		else {
			divident = divisor;
			divisor = remainder;
		}
	}

	
	
	
}
}
