package day4;

public class ArrayLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char java[] = {'J','a','v','a'}; // 각 element로 구성되는 char 타입 배열
		
		// 소문자는 대문자로, 대문자는 소문자로 변환하여 저장
		// 아스키 코드 상에서 소문자는 97~122에 할당되며,
		// 대문자는 65~90에 할당됩니다.(십진수 기준)
		for(int i = 0; i < java.length; i++) {
			if((int) java[i] >= 97 && (int)java[i] <= 122) {
				java[i] -= 32;
		
			} else if ((int) java[i] >=65 && (int) java[i] <=90) {
			java[i] += 32;
			}
	
		}
		
		// 변환된 element 출력
		for (char e: java) {
			System.out.println(e);
		}


	}
}
