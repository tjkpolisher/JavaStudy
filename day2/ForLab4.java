package day2;

public class ForLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenNum =  0;
		int oddNum = 0;
		int rem;
		for(int i = 1; i <= 100; i++) {
			rem = i % 2;
			switch(rem) {
			case 0:{
				evenNum += i;
				break;
			}
			default:{
				oddNum += i;
				break;
			}
			}
		}
		System.out.println("1부터 100까지의 숫자들 중에서 ");
		System.out.printf("짝수의 합은 %d 이고\n", evenNum);
		System.out.printf("홀수의 합은 %d 이다.", oddNum);
		
	}

}
