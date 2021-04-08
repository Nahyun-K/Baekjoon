import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11653 { // 소인수분해

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		int i = 2;

		while(N != 1) {
			num = N % i;
			if(num == 0) {
				N /= i;
				System.out.println(i);
				--i;
			}
			i++;
		}
	}
	
}
