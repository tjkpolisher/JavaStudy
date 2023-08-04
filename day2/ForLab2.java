package day2;

public class ForLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oddEven;
		int rem;
		for (int i = 9; i >= 4; i--) {
			rem = i % 2;
			switch(rem) {
			case 0: {
				oddEven = "짝수";
				break;
			}
			default:
				oddEven = "홀수";
			
			}
			System.out.println(i + " : " + oddEven);
		}
	}

}