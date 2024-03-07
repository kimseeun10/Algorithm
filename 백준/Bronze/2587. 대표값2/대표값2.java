import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int N = sc.nextInt();
			sum += N;
			arr.add(N);
		}
		
		Collections.sort(arr);
		
		System.out.println(sum/5);
		System.out.println(arr.get(2));
		
	}
}