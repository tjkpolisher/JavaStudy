package day4;

public class MethodLab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary1 = {10, 20, 30};
		int[] ary2 = {100, 500, 300, 200, 400};
		int[] ary3 = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		
		System.out.printf("가장 큰 값은 %d 입니다.\n",maxNumArray(ary1));
		System.out.printf("가장 큰 값은 %d 입니다.\n",maxNumArray(ary2));
		System.out.printf("가장 큰 값은 %d 입니다.\n",maxNumArray(ary3));
	}
	
	static int maxNumArray(int[] n1) {
		int maximum = 0;
		for (int i = 0; i < n1.length; i++) {
			if (maximum < n1[i]) 
					maximum = n1[i];
			}
		return maximum;
	}
	
}
