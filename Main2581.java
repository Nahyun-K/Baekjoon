import java.util.*;
public class Main2581 { // 소수
	// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는
	// 프로그램을 작성하시오
	public static void main(String[] args) {
		// 입력 입력의 첫째 줄에 M이, 둘째 줄에는 N이 주어진다 M은 N보다 작거나 같다
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();	// 60
		int N = sc.nextInt();	// 100
		int i = 2;
		int num = N;
		while(true) {
			System.out.println("xxxxxx");
			if(num % i == 0) {
				num /= i;
				i--;
			}
			i++;
			System.out.println("나누는 값 : " + i);
			
			if(num == 1) {
				break;
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		// 출력 N이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을
		// 출력한다 단 M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다

	}

}
