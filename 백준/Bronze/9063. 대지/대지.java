import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			x.add(a); // x
			y.add(b); // y

		}
		
		int xmax = Collections.max(x);
		int ymax = Collections.max(y);
		int xmin = Collections.min(x);
		int ymin = Collections.min(y);
		
		int A = xmax - xmin;
		int B = ymax - ymin;
		
		System.out.println(A*B);
		
    }
}