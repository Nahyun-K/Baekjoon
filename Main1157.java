
import java.util.*;
public class Main1157 {
	// �ܾ� ����
	// ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�
	// �� �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�
	public static void main(String[] args) {
		// �Է� ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־����� 
		// �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		char[] ch = new char[n];
		for(int i = 0; i < n; i++) {
			ch[i] = str.charAt(i);
			//System.out.println((int)ch[i]);	// ���ڷ� �� ��ȯ ��
			if((int)ch[i] >= 97) { // if �ҹ��ڶ�� > �빮�ڷ� �ٲ� ��
				ch[i] -= 32;
			}
			//System.out.println(ch[i]);	// �빮�ڷ� �� �ٲ�
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//��� ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�
		// �� ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�

	}

}
