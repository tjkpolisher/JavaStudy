package day3;

public class ControlLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber;
		int sumV = 0;
		int counter = 0;
		while(true) {
			randomNumber = (int)(Math.random()*10) + 10; // 10부터 20 사이의 난수
			
			if(randomNumber % 3 == 0 || randomNumber % 5 ==0) {
				for(int i=1; i<=randomNumber; i++) {
					sumV += i;
				}
				
				System.out.println(sumV);
				
				sumV = 0;
				counter++;
				
			} else if (randomNumber==11 || randomNumber==17 || randomNumber==19) {
				System.out.printf("%d회 반복함\n",counter);
				break;
			} else {
				System.out.println("재수행");
			}
		}
		
		
	}

}
