package Lec_02;

import java.util.*;

public class Prime_Numbers_Between_Range {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int starting_n1 = scn.nextInt();
        int ending_n2 = scn.nextInt();
        
        for (int i = starting_n1; i <= ending_n2; i++) {
            if (i < 2) {
                continue; // Skip numbers less than 2 as they are not prime
            }
            
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(i);
            }
        }
        
        scn.close();
    }
}
