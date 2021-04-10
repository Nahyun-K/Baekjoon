import java.util.Scanner;

public class Main15650 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		// N M 순서
		// 1 <= M <= N <= 8
		// 1 ~ N 까지 자연수 중 중복 없이 M개 고름
		// 오름차순
		// N*(N-1)*(1/2)
		
		
		int num = (int)(factorial(N)/factorial(M));
		num = num / factorial(N-M);
		System.out.println(num);
		
		int[][] arr = new int[num][M];
		for(int i = 0; i < num; i++) {

			for(int j = 0;j < M; j++) {
				arr[i][j] = 1;
				arr[i][j]++;
				
				System.out.println("i : " + i + " j : " + j);
				
				System.out.print(arr[i][j] + " ");
				

				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}
	static int factorial(int n) {
		int res = n;
		if(n > 0) {
			res = res * factorial(n-1);	
		}else {
			res = 1;
		}
		return res;
	}

}
