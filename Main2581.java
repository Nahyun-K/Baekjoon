import java.util.*;
public class Main2581 { // �Ҽ�
	// �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã��
	// ���α׷��� �ۼ��Ͻÿ�
	public static void main(String[] args) {
		// �Է� �Է��� ù° �ٿ� M��, ��° �ٿ��� N�� �־����� M�� N���� �۰ų� ����
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
			System.out.println("������ �� : " + i);
			
			if(num == 1) {
				break;
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		// ��� N�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ���
		// ����Ѵ� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�

	}

}
