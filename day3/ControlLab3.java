package day3;

public class ControlLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber;
		String message1 = "";
		String message2 = "";
		
		while(true) {
			randomNumber = (int)(Math.random()*120) + 1; // 1부터 120까지의 난수 추출
			if (randomNumber < 50) {
				message1 = "%d: 50 미만\n";
				switch(randomNumber){
					case 3:
					case 13:
					case 23:
					case 33:
					case 43:
						message2 = "%d : *듀크팀*\n";
				}
				break;
				
			} else if (randomNumber >= 50 && randomNumber <= 80) {
				message1 = "%d: 50 이상 80 이하\n";
				
				if (randomNumber >=70 && randomNumber <= 79){
					
					message2 = "%d : *턱시팀*\n";
					
				}
				break;
				
			} else if (randomNumber >= 81 && randomNumber <= 100) {
				
				continue;
				
			} else {
				
				break;
				
			}
		}
		String message = message1 + message2;
		
		System.out.printf(message, randomNumber, randomNumber);
	}

}
