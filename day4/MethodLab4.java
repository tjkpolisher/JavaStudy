package day4;

public class MethodLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 20;
		for (int i=1; i <= 5; i++) {
			System.out.print(getRandom(n1));
			if (i < 5) {
				System.out.print(", ");
			}
		}
		
		System.out.println("");
		for (int i=1; i <= 5; i++) {
			System.out.print(getRandom(n1, n2));
			if (i < 5) {
				System.out.print(", ");
			}
		}
	}

	public static int getRandom(int n) {
		int randomNumber = (int)(Math.random() * n) + 1;
		return randomNumber;
	}
	
	public static int getRandom(int n1, int n2) {
		int randomNumber = (int)(Math.random() * n1) + (n2 - n1);
		return randomNumber;
	}
}
