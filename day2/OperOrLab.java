package day2;

public class OperOrLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = (int)(Math.random() * 6) + 1;
		if (grade == 1 || grade ==2 || grade==3) {
			System.out.printf("%d 학년은 저학년입니다.", grade);
		} else {
			System.out.printf("%d 학년은 고학년입니다.", grade);
		}
	}

}
