import java.util.Scanner;

public class Main10250 { // ACM ȣ��
	
	public static void main(String[] args) {
		// H : �� / W : �� �� / N : ���° �մ�
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] x = new int[T];	// ���ȣ
		int[] y = new int[T];	// ����
		int[] k = new int[T];
		
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();	// ��
			int W = sc.nextInt();	// �� ��
			int N = sc.nextInt();	// ���° �մ�
			// 8�� 8ȣ 64��° 808
			// 64 / 8
			
				// ���ȣ
			k[i] = N / H;
			if(k[i] <= W) {
				x[i] = N / H + 1;	// ���ȣ
				y[i] = N % H;	
			
				if(y[i] == 0) {
					x[i] = N / H;
					y[i] = H;
				}
			}else {
				
			}
			
		}
		for(int i = 0; i < T; i++) {
			if(x[i] > 9) {
				System.out.println(y[i]  + x[i]);
			}else {
				System.out.println(y[i]+"0"+x[i]);
			}	
		}
	}
}
