package lab3;

import java.util.Scanner;

public class InCurcle3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a point width two coordinates: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(Math.sqrt(a*a+b*b)<=10) {
			System.out.print("Point ("+ a +".0,"+ b +".0) is in the circle");
		}
		else {
			System.out.print("Point ("+ a +".0,"+ b +".0) is not in the circle");
		}
	}

}

