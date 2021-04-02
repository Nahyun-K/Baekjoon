import java.util.*;
public class Main2775 {
	//
	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	// aÃş
		int b = sc.nextInt();	// bÈ£
		int res = 0;
		int sum = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 1; j <= b; j++) {
				if(i == 0) {
					res = j;
				}
				sum += res;
				System.out.println(res);
				System.out.println("sum : " + sum + "  i / j : " + i + " / " + j);
			}
		}
		//System.out.println("sum : "+sum);
		
		

	}

}
