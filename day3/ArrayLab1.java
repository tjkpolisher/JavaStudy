package day3;

public class ArrayLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[10];
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<ary.length;i++) {
			ary[i] = (i + 1) * 10;
		}
		
		System.out.println("첫 번째 : " + ary[0]);
		System.out.println("마지막 : " + ary[ary.length - 1]);
		System.out.println("합 : " + (ary[0] + ary[ary.length - 1]));
		
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		for(int i=ary.length-1; i >= 0; i--) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		for(int i=1;i<ary.length;i+=2) {
			System.out.print(ary[i] + " ");
		}
	}

}
