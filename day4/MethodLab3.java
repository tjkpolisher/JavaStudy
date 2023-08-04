package day4;

public class MethodLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber1, randomNumber2, subtracted;
		
		for (int i = 1; i <= 5; i++) {
			randomNumber1 = (int)(Math.random() * 30) + 1;
			randomNumber2 = (int)(Math.random() * 30) + 1;
			subtracted = subtraction(randomNumber1, randomNumber2);
			System.out.printf("%d 와 %d 의 차는 %d 입니다.\n", randomNumber1, randomNumber2, subtracted);
		}
		
		
	}
	
	static int subtraction(int p1, int p2) {
		int result;
		if (p1 >= p2)
			result = p1 - p2;
		else
			result = p2 - p1;
		return result;
	}
}
