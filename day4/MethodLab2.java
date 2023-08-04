package day4;

public class MethodLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String evenOdd1 = (isEven(10)) ? "짝수" : "홀수";
		String evenOdd2 = (isEven(13)) ? "짝수" : "홀수";
		
		System.out.printf("10은 %s 입니다.\n", evenOdd1);
		System.out.printf("13은 %s 입니다.", evenOdd2);
	
	}

	static boolean isEven(int n) {
		boolean isEven;
		if (n % 2 == 0)
			isEven = true;
		else
			isEven = false;
		return isEven;
	}
	
	
}
