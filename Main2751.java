import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2751 { // �� �����ϱ�2
	// N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷� �ۼ�
	public static void main(String[] args) throws NumberFormatException, IOException {
		// �Է� ù° �ٿ� ���� ���� N�� �־�����
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		ArrayList<Integer> arr = new ArrayList<>();
		int num = Integer.parseInt(bf.readLine());
		for(int i=0; i<num; i++) {
			arr.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(arr);
		for(int i=0; i<num; i++) {
			System.out.println(arr.get(i));
		}
		 
//		// StringBuilder�� ����?
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		int N = sc.nextInt();
//		ArrayList<Integer> n = new ArrayList<>();
//		for(int i=0; i<N; i++) {
//			n.add(sc.nextInt());
//		}
//		Collections.sort(n);
//		for(Integer i : n) { //for���� ���� ��ü���
//		    sb.append(i).append('\n');
//		}
//		System.out.println(sb);
	}

}
