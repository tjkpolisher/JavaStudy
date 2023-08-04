package day4;

public class MethodLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTitle();
		System.out.printf("가격은 %d원입니다.",getPrice());
	}

	
	static void printTitle() {
		System.out.println("우리의 자바교재명은 <혼자 공부하는 자바>입니다.");
	}
	
	static int getPrice() {
		int price = 24000;
		return price;
	}
}
