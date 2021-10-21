package lab3;

import java.util.Scanner;

public class DayOfWhat3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imput = new Scanner(System.in);
		 
        System.out.print("Enter a year: (e.g, 2012): ");
        int year = imput.nextInt();
 
        System.out.print("Enter a mouth: 1-12:  ");
        int mouth = imput.nextInt();
 
        System.out.print("Enter the day of the mouth: ");
        int day = imput.nextInt();
 
        int tempMouth = mouth;      //一月二月记为13,14,年数记为上一年
        switch (tempMouth){
            case 1: mouth = 13; year -=1; break;
            case 2: mouth = 14; year -=1; break;
        }
 
        int century = year / 100;
        int yearOfCentury = year % 100;
        
        int theDayIs = (day + 26 * (mouth + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
        //0为周六1为周日2为周一3为周二4为周三5为周四6为周五
        switch (theDayIs){                                     
            case 0 :System.out.println("Day of the week is Saturday"); break;
            case 1 :System.out.println("Day of the week is Sunday"); break;
            case 2 :System.out.println("Day of the week is Monday"); break;
            case 3 :System.out.println("Day of the week is Tuesday"); break;
            case 4 :System.out.println("Day of the week is Wednesday"); break;
            case 5 :System.out.println("Day of the week is Thursday"); break;
            case 6 :System.out.println("Day of the week is Friday"); break;
        }
 
    }
}