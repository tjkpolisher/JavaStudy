package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber; // 난수 추출
		int counter = 0; // 출력 횟수 카운터
		
		while(true) {
			randomNumber = (int)(Math.random()*30); // "0부터" 30 사이의 난수
			
			if((randomNumber>=27 && randomNumber <=30) || randomNumber==0) {
				System.out.printf("출력횟수는 %d 번입니다", counter);
				break;
			} else {
				System.out.printf("%d-%c, %d, 0x%h\n", randomNumber, (char)randomNumber + 64, randomNumber + 64, randomNumber+64);
			}
			counter++;
		}
		
		
	}

}
