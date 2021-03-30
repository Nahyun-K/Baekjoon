import java.util.*;
public class Main2422 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// 2*N-1
		for(int i=1; i<=N; i++) {
			for(int j = N-i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}