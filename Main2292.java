import java.util.*;
public class Main2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 0;
		N -= 1;		
		if(N == 0) {
			i = 0;
		}
		while(true) {
			N = N - 6 * i;
			
			if(N <= 0) {
				break;
			}
			i++;
	
		}
		System.out.println(i+1);
	}

}
