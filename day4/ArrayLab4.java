package day4;

public class ArrayLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random() * 5) + 5; // 5부터 10 사이의 난수 추출
		int[] ary = new int[randomNumber]; // 추출된 난수값을 크기로 갖는 int 타입의 배열 생성
		
		int element; // 배열에 저장할 element(난수값) - 일단 정수형으로 선언
		for (int i = 0; i < randomNumber; i++) {
			element = (int)(Math.random() * 26) + 1; // 1부터 26 사이의 난수 추출
			ary[i] = element;
		}
		
		char[] chr = new char[randomNumber]; // ary와 같은 크기를 갖는 char 타입의 배열 chr 생성
		for (int i = 0; i < randomNumber; i++) {
			element = ary[i] + 96; // ary 배열의 element를 각 알파벳 소문자 아스키 코드에 해당하는 값으로 바꿔줌
			chr[i] = (char)element;
		}
		
		for(int i = 0; i < randomNumber; i++) {
			if (i==ary.length - 1) {
				System.out.println(ary[i]);
			} else {
				System.out.printf("%d,", ary[i]);
			}
			
		}
		
		for(int i = 0; i < randomNumber; i++) {
			if (i==chr.length - 1) {
				System.out.println(chr[i]);
			} else {
				System.out.printf("%c,", chr[i]);
			}
			
		}
	}

}
