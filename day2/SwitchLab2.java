package day2;

public class SwitchLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extracted = (int)(Math.random() * 5) + 1;
		int result = 0;
		
		switch(extracted) {
		case 1: {
			result = 300 + 50;
			break;
		}
		case 2: {
			result = 300 - 50;
			break;
		}
		case 3: {
			result = 300 * 50;
			break;
		}
		case 4: {
			result = 300 / 50;
			break;
		} 
		case 5: {
			result = 300  % 50;
			break;
		}
		}
		
		
		
		System.out.printf("결과값 : %d", result);
	

	}
}
