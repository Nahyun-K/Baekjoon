import java.util.Scanner;

public class Main2163 {
	private static int sum;
	// ���ݸ� �ڸ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		// N M ¦���� �� / Ȧ���� ��
		
		
		System.out.println(division(11));
		
		
		
	}
	static int division(int n) {	// 11	//5 // 2
		if(n % 2 == 1) { // ���ڰ� Ȧ���� ��
			int x = n / 2;//5	//2 //
			int y = x + 1;//6	//3
			sum++;
			division(x);
			division(y);
		}else if(n == 1) {
			
		}else if(n % 2 == 0){ // ¦�� �϶�
			int z = n / 2;	// �� �� �ʿ���
			sum++;
			division(z);
		}
		return sum;
	}

}
