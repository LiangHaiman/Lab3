package lab3;

import java.util.Scanner;

public class ISBN3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int d1 = num/100000000;
		int d2 = num/10000000 % 10;
		int d3 = num/1000000 % 10;
		int d4 = num/100000 %10;
		int d5 = num/10000 % 10;
		int d6 = num/1000 %10;
		int d7 = num/100 %10;
		int d8 = num/10 %10;
		int d9 = num % 10;
		
		int sum = (d1 + 2 * d2 + 3 * d3 + 4 * d4
				+ 5 * d5 + 6* d6 + 7 * d7 + 8*d8
				+ 9* d9) % 11;
		
		if(sum==10) {
			System.out.print("The ISBN-10 number is " + d1
					+ d2 + d3 + d4 + d5 + d6 + d7
					+ d8 + d9 +"X"
					);
		}
		else {
			System.out.print("The ISBN-10 number is " + d1
					+ d2 + d3 + d4 + d5 + d6 + d7
					+ d8 + d9 + sum
					);
		}
	}

}
