import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine()); //Int
		//String s = br.readLine();
		int res = 0;
		for(int i =0; i < num; i++) {
			//System.out.println(i+"번째");
			
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
				
			res = x+y;
			//System.out.println(res);
			String s = Integer.toString(res);
			bw.write(s);
			bw.newLine();//줄바꿈
		}
		
		//String s = bf.readLine(); //String
		//int i = Integer.parseInt(bf.readLine()); //Int
		//bw.write(문자열);
		
		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();//스트림 닫음
	}

}
