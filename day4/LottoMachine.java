package day4;

public class LottoMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottery = new int[6]; // 난수를 담을 길이 6짜리 int형 배열
		int randomNumber;
		
		for (int i=0; i < lottery.length; i++) {
			// 1부터 45 사이의 난수를 중복 없이 추출
			while (true) {
				randomNumber = (int)(Math.random() * 45) + 1;
				boolean isDuplicate = false; // 초기 값으로 중복되지 않는 것으로 설정
				// 중복이 발생할 경우 다시 난수 추출로 돌아갑니다.
				for (int j=0; j <= i; j++) {
					if (randomNumber == lottery[j]) {
						isDuplicate = true;
						break;			
					} 
				}
				if (!isDuplicate) {
					lottery[i] = randomNumber;
					break;
				}	
			}	
		}
			
		
		// 결과 출력
		System.out.print("오늘의 로또 번호 - ");
		for (int i = 0; i < lottery.length; i++) {
		if (i==lottery.length - 1) {
			System.out.println(lottery[i]);
		} else {
			System.out.printf("%d, ", lottery[i]);
		}
	
		}

	}
}