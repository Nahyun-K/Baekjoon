import java.util.*;
public class Main1085 {
	// 직사각형에서 탈출
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int min = 0;
		int m = w - x; // 가로
		// x VS m
		if(m < x) {
			x = m;
		}
		int n = h - y; // 세로
		// y VS n
		if(n < y) {
			y = n;
		}
		if(x < y) {
			min = x;
		}else {
			min = y;
		}
		System.out.println(min);		

	}

}
