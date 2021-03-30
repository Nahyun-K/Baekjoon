import java.util.Scanner;

public class Main2163 {
	private static int sum;
	// 초콜릿 자르기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		// N M 짝수일 때 / 홀수일 때
		
		
		System.out.println(division(11));
		
		
		
	}
	static int division(int n) {	// 11	//5 // 2
		if(n % 2 == 1) { // 숫자가 홀수일 떼
			int x = n / 2;//5	//2 //
			int y = x + 1;//6	//3
			sum++;
			division(x);
			division(y);
		}else if(n == 1) {
			
		}else if(n % 2 == 0){ // 짝수 일때
			int z = n / 2;	// 두 개 필요함
			sum++;
			division(z);
		}
		return sum;
	}

}
