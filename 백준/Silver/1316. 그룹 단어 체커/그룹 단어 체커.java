import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 단어의 개수
		int count = N; // 그룹 단어의 개수
		
		for(int i=0; i<N; i++) {
			boolean A [] = new boolean [26]; // a = 97번 ~ z = 122번
			String S = br.readLine(); 
			A[(int)S.charAt(0)-97] = true; // 첫 단어 확인
			
			for(int k=1; k<S.length(); k++) {
				char c = S.charAt(k);
				//이전문자와 같으면 continue
				if(c == S.charAt(k-1)) continue;
				
				//이전 문자와 다르고 이미 나타난 문자면 그룹 단어아니므로 count--
				if(A[(int)c-97]) {
					count--;
					break;
				}
				
				A[(int)c -97] = true; // 나타난 단어 확인
			}
		}
		System.out.println(count);
	}
}