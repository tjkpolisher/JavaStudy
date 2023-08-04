package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extracted = (int)(Math.random() * 5) + 1;
		int result = 0;
		
		if (extracted == 1) {
			result = 300 + 50;
		} else if(extracted == 2) {
			result = 300 - 50;
		} else if(extracted == 3) {
			result = 300 * 50;
		} else if(extracted == 4) {
			result = 300 / 50;
		} else if(extracted == 5) {
			result = 300  % 50;
		}
		
		
		
		System.out.printf("결과값 : %d", result);
	

	}
}