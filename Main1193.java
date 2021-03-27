import java.util.*;
public class Main1193 {

	public static void main(String[] args) {
		// 홀수 줄 세로 짝수 줄 가로
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int i = 1;
		int sum = 0;
		int X2 = X;
		while(true) {
			X -= i;
			if(X < 0) {
				break;
			}
			if(X == 0) {
				break;
			}
			i++;	// X는 i번째 줄에 있음을 확인
		}
		for(int j = i - 1; j >= 0; j--) {
			sum += j;
		}
		i = i + 1;	// i = 5인데 -> 6 됐음 분모 + 분자가 6임
		int x;	// 분자
		int y; 	// 분모
		if(i % 2 == 0) { // 홀수 세로 14 -> 5번째 줄임
			y = 1; // 분모가 1
			x = i - 1; // 분자 5
			for(int k = 0; k < X2 - sum -1; k++) {	// i = 6
				x--;	// 분자 5에서 1씩 줄어듦
				y++;	// 분모 1에서 1씩 늘어남
			}
			System.out.println(x + "/" + y);
		}else { // 짝수 가로 i = 5
			x = 1;	// 분자 : 
			y = i - 1;	// 분모 : 
			for(int k = 0; k < X2 - sum - 1; k++) {
				x++;
				y--;
			}
			System.out.println(x + "/" + y);
		}		
		
	}

}
