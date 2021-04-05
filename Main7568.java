import java.util.Scanner;

public class Main7568 {

	public static void main(String[] args) {
		// 몸무게	x kg
		// 키	y cm
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// Test case
		
		int[][] big = new int[T][2];
		for(int i=0; i<T; i++) {
			for(int j=0; j < 2; j++) {
				big[i][j] = sc.nextInt();
			}
		}
		int[] sum = new int[T];
		for(int i=0; i<T; i++) {
			for(int j = 0; j < T; j++) {
				if(big[i][0] > big[j][0]) {
					if(big[i][1] > big[j][1]) {
						sum[i]++;
					}
				}else {
				}
			}
			System.out.print(sum[i] + " ");	// 제일 큰 수 덩치 큰 사람
		}
		
		
		
		
		
		

	}

}
