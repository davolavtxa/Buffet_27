/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int my_number = 677;
		int guess;
		do {
			guess = sc.nextInt();
			if (guess > my_number) {
				System.out.println("Lower");
			} else if (guess < my_number) {
				System.out.println("Higher");
			}
		} while (guess != my_number);
	}
}
