import java.util.Scanner;

public class Main2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = 2 * N - 1;
		for(int i =0; i<N; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 2*i; j < X; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = N-2; i>= 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 2*i; j < X; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}
