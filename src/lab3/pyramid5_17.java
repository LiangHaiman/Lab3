package lab3;

import java.util.Scanner;

public class pyramid5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int lines = input.nextInt();
		for(int n = 1;n <=lines ; n++) {
			if(lines != n) {
				for(int a =1 ; a <=(lines -n); a++)
					System.out.print(" ");
			}
			for(int b = n ;b > 0; b--) {
				System.out.print(b);
			}
			if(n>=2) {
				for(int c = 2; c<=n;c++) {
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
