import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();	// 테스트 케이스
		int[] stuNum = new int[N];
		float[] percentage = new float[N];
		for(int i = 0; i < N; i++) {
			float sum = 0;
			stuNum[i] = in.nextInt();	// 과목당 학생 수
			int[] score = new int[stuNum[i]];
			for(int j = 0; j < stuNum[i]; j++) {
				score[j] = in.nextInt();	// 과목당 학생 점수 입력
				sum += score[j];
			}
			sum = sum / stuNum[i];
			int res = 0;
			for(int j = 0; j < stuNum[i]; j++) {
				
				if(sum < score[j]) {
					res++;
				}
			}
			percentage[i] = (float)res / (float)stuNum[i];
			percentage[i] *= 100;
			
		}
		for(int i = 0; i < N; i++) {
			System.out.printf("%.3f%%",percentage[i]);
			System.out.println();		
		}
	}
}
