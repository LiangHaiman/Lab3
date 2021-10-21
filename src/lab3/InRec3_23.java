package lab3;

import java.util.Scanner;

public class InRec3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a point with two coordinates: ");
		Scanner input = new Scanner (System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x<=10/2&&x>=-10/2&&y<=5.0/2&&y>=-5.0/2) {
			System.out.print("Point (" + x + ".0,"+ y + ".0) is in the rectangle"
					);
		}
		else {
			System.out.print("Point (" + x + ".0,"+ y + ".0) is not in the rectangle"
					);
		}
	}

}
