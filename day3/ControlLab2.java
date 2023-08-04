package day3;

public class ControlLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=10; i++) {
			if (i % 3 == 0 || i % 4 ==0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}

}
