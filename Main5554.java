import java.util.Scanner;
public class Main5554 {
	// �б� PC�� �п�
	public static void main(String[] args) {
		// �� -> x �� y �� ���
		Scanner in = new Scanner(System.in);
		int[] go = new int[4];
		int sum = 0;
		for(int i=0; i<4; i++) {
			go[i] = in.nextInt();
			sum += go[i];
			
		}
		int min = 0;
		int sec = 0;
		while(true) {
			if(sum < 60) {
				break;
			}else {
				sec = sum % 60;
				min = sum / 60;
				sum = min;	
			}
		}
		System.out.println(min);
		System.out.println(sec);

	}

}
