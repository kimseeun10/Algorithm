import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N명 응시
		int k = sc.nextInt(); // 상을 받는 수
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			arr.add(x);
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr.get(k-1));
	}
}