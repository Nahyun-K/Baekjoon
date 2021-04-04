import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main4673 {
	// 함수		// 입력 없음
	public static void main(String[] args) {
		int num = 1;
		//ArrayList<Integer> arr = new ArrayList<>();
		int[] list = new int[100];
		int res = 1;
		while(num < 100) {
			System.out.println(selfNumber(num));
			//arr.add(selfNumber(num));
			list[num] = selfNumber(num);
			num++;
			
			
		}
		
//		for(int i =1; i<100; i++) {
//			for(int j=1; j<100; j++) {
//				//System.out.println(selfNumber(i));
//				if(selfNumber(i) == j) {
//					System.out.println(j);
//				}
//			}
//		}
//		Collections.sort(arr);
//		System.out.println(arr);
//		System.out.println(arr.get(1));
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		while(res < 100) {
//			if(arr.get(res) != res)
//				System.out.println(res);
//			
//			res++;
//		}
		
		
	}
	static int selfNumber(int n) {
		int sum = 0;
		sum = n + (n / 10) + (n % 10);
		
		return sum;
	}

}
