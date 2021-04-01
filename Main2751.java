import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2751 { // 수 정렬하기2
	// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램 작성
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력 첫째 줄에 수의 개수 N이 주어진다
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		ArrayList<Integer> arr = new ArrayList<>();
		int num = Integer.parseInt(bf.readLine());
		for(int i=0; i<num; i++) {
			arr.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(arr);
		for(int i=0; i<num; i++) {
			System.out.println(arr.get(i));
		}
		 
//		// StringBuilder가 뭘까?
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		int N = sc.nextInt();
//		ArrayList<Integer> n = new ArrayList<>();
//		for(int i=0; i<N; i++) {
//			n.add(sc.nextInt());
//		}
//		Collections.sort(n);
//		for(Integer i : n) { //for문을 통한 전체출력
//		    sb.append(i).append('\n');
//		}
//		System.out.println(sb);
	}

}
