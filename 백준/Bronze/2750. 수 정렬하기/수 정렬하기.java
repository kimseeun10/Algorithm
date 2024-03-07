import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			arr.add(a);
		}
		
		Collections.sort(arr);
		
		for(int i=0; i<M; i++) {
			System.out.println(arr.get(i));
			
		}
	}
}