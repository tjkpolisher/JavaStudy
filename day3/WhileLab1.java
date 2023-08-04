package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random()*5) + 5; // 5부터 10 사이의 난수
		
		// for 문으로 구현했을 때
		System.out.println("[for 결과]");
		for(int i=1; i <= randomNumber; i++) {
			System.out.printf("%d -> %d\n", i, i * i);
		}
		
		// while 문으로 구현했을 때
		System.out.println("[while 결과]");
		int i=1;
		while(i <= randomNumber) {
			System.out.printf("%d -> %d\n", i,  i * i);
			i++;
		}
	}

}
