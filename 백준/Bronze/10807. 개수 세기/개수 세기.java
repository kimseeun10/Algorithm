import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] ar = new int [N];
		
		for(int i =0; i<N; i++) {
			int in = sc.nextInt();
			ar[i] = in;
		}
		int v = sc.nextInt();
		int sum = 0;
		
		for(int j=0; j<N; j++) {
			if(ar[j] == v) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	    	
	}
}
