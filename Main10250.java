import java.util.Scanner;

public class Main10250 { // ACM 호텔
	
	public static void main(String[] args) {
		// H : 층 / W : 방 수 / N : 몇번째 손님
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] x = new int[T];	// 방번호
		int[] y = new int[T];	// 층수
		int[] k = new int[T];
		
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();	// 층
			int W = sc.nextInt();	// 방 수
			int N = sc.nextInt();	// 몇번째 손님
			// 8층 8호 64번째 808
			// 64 / 8
			
				// 방번호
			k[i] = N / H;
			if(k[i] <= W) {
				x[i] = N / H + 1;	// 방번호
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
