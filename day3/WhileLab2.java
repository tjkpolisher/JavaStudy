package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pairNum1, pairNum2;
		while(true) {
			// 1부터 6 사이의 난수
			pairNum1 = (int)(Math.random()*6) + 1;
			pairNum2 = (int)(Math.random()*6) + 1;
			if (pairNum1 > pairNum2) {
				System.out.printf("%d이 %d 보다 크다.\n", pairNum1, pairNum2);
			} else if (pairNum1 < pairNum2) {
				System.out.printf("%d이 %d 보다 작다.\n", pairNum1, pairNum2);
			} else {
				System.out.println("게임 끝.");
				break;
			}
			
		}
	}

}
