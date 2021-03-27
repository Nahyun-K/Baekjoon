
import java.util.*;
public class Main1157 {
	// 단어 공부
	// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오
	// 단 대문자와 소문자를 구분하지 않는다
	public static void main(String[] args) {
		// 입력 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다 
		// 주어지는 단어의 길이는 1,000,000을 넘지 않는다
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		char[] ch = new char[n];
		for(int i = 0; i < n; i++) {
			ch[i] = str.charAt(i);
			//System.out.println((int)ch[i]);	// 숫자로 잘 변환 됨
			if((int)ch[i] >= 97) { // if 소문자라면 > 대문자로 바꿔 줌
				ch[i] -= 32;
			}
			//System.out.println(ch[i]);	// 대문자로 잘 바뀜
		}
		
//		for(int i = 0; i < n; i++) {
//			int cnt = 0;
//			for(int j = i; j >= 0; j++) {
//				if(ch[i] == ch[j]) {
//					cnt++;
//				}
//			}
//			System.out.println(cnt);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//출력 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다
		// 단 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다

	}

}
