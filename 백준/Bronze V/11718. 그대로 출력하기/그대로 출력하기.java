
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문자를 입력받기 위해서 BufferedReader 객체 생성

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 문자를 출력하기 위해 BufferedWriter 객체 생성
		
		int count = 0;
		
		while(count<100) {
			String W = br.readLine();
			
			if(W == null || W.equals("")) {
				break;
			}
			
			bw.write(W);
			bw.newLine();
			
			count++;
		}
		
		br.close();
		bw.close();
		
	}
	
}