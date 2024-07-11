package Lec_02;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        boolean flag = false;
        for(int i = 2; i <= n / 2; i++) {
            System.out.println("Checking for :" + i);
            if(n % i == 0) {
                flag = true;
                System.out.println("Not prime");
                break;
            }
        }

        if (!flag) {
            System.out.println("Prime");
        }

        scn.close();
    }
}
