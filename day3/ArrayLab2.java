package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[10]; // 10개의 숫자를 저장할 수 있는 배열 생성
		int randomNumber;
		int sumV = 0;
		
		for(int i=0;i<ary.length;i++) {
			randomNumber = (int)(Math.random() * 16) + 4;
			ary[i] = randomNumber;
			sumV += ary[i];
		}
		
		// 모든 원소의 값 출력
		System.out.print("모든 원소의 값 : ");
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println("");
		System.out.println("모든 원소의 합 : " + sumV);
		
	}

}
