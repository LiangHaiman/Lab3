package lab3;

public class Tuition5_7 {
	public static void main(String[] args) {
		double tution = 10000;
		for(int i = 0 ; i < 10 ; i++) {
			tution = tution * 1.05;
			
		}
		double tution1 = tution;
		for(int j = 0 ; j <4 ; j++) {
			tution1 = tution1 + tution1 * 1.05 ;
		}
		System.out.println("十年后的学费："+tution);
		System.out.println("十年后算起，四年内的总学费："+ tution1);
	}
}
