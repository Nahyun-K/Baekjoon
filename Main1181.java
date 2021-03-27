import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] word2 = new String[N];
		String newWord;
		for(int i=0; i<N; i++) {
			word2[i] = sc.next();
		}
		ArrayList<String> arrayList = new ArrayList<>();

        for(String item : word2){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }
        
        String[] word = arrayList.toArray(new String[0]);
		N = arrayList.size();
		Arrays.sort(word);
		// 버블정렬 1. 길이가 짤은 것부터 정렬
		for(int i=N-1; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				if(word[j].length() > word[j+1].length()) {
					newWord = word[j];
					word[j] = word[j+1];
					word[j+1] = newWord;
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.println(word[i]);
		}
		
	}
	
}
