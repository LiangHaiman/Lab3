package lab3;

import java.util.Scanner;

public class Triangle3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			System.out.print("����ֵ���Ϸ�");
		}
		else {
			System.out.println("����ֵ�Ϸ�");
		}
	}

}
