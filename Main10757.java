
import java.math.BigInteger;
import java.util.Scanner;

public class Main10757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		BigInteger big = new BigInteger(a);
		BigInteger big2 = new BigInteger(b);
		
		big = big.add(big2);
		System.out.println(big);
		

	}

}
