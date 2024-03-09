import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Character> arr = new ArrayList<Character>();
		sb.append(N);
		
		for(int i=0; i<sb.length(); i++) {
			arr.add(sb.charAt(i));
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		for(int i=0; i<sb.length(); i++) {
			System.out.print(arr.get(i));
		}
	}
}