import java.util.*;
public class Main1193 {

	public static void main(String[] args) {
		// Ȧ�� �� ���� ¦�� �� ����
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
			i++;	// X�� i��° �ٿ� ������ Ȯ��
		}
		for(int j = i - 1; j >= 0; j--) {
			sum += j;
		}
		i = i + 1;	// i = 5�ε� -> 6 ���� �и� + ���ڰ� 6��
		int x;	// ����
		int y; 	// �и�
		if(i % 2 == 0) { // Ȧ�� ���� 14 -> 5��° ����
			y = 1; // �и� 1
			x = i - 1; // ���� 5
			for(int k = 0; k < X2 - sum -1; k++) {	// i = 6
				x--;	// ���� 5���� 1�� �پ��
				y++;	// �и� 1���� 1�� �þ
			}
			System.out.println(x + "/" + y);
		}else { // ¦�� ���� i = 5
			x = 1;	// ���� : 
			y = i - 1;	// �и� : 
			for(int k = 0; k < X2 - sum - 1; k++) {
				x++;
				y--;
			}
			System.out.println(x + "/" + y);
		}		
		
	}

}
