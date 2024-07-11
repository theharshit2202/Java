/*Help Lakshya bhaiya count!!!

Input Format
First line contains an Integer n.

Constraints
n<10,000

Output Format
Print the counting from 1 to n.

Sample Input
5
Sample Output
1
2
3
4
5
Explanation
Maybe its Counting bhai!! Who knows ?*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;  // Increment i to avoid infinite loop
        }

        scn.close();  // Close the scanner
    }
}
