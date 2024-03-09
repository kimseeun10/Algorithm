import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int x [] = new int [N];
		
		for(int i=0; i<N; i++) {
			x[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(x);
		
		for(int i : x) {		
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);
	}
}
