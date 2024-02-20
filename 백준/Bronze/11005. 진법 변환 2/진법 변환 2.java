import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 문제 A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35 
		//A는 65 Z는 90 (아스키코드) - 55 해주기
		
		int N = Integer.parseInt(st.nextToken()); 
		int B = Integer.parseInt(st.nextToken()); 
	
		while(N != 0) {
			
			if(N%B >= 10) { // '10진수 이상의 수'라라는 것을 뜻함
				sb.append((char)(N%B+55));
				
			}else {
				sb.append(N%B);
			}
			
			N/=B;
		}
		System.out.println(sb.reverse().toString());
		
		br.close();

	}
}
