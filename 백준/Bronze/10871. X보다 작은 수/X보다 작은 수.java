import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = sc.nextInt();
		
		int [] ar = new int[N];
		
		for(int i=0; i<N; i++) {
			ar[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<N; i++) {			
			if(ar[i] < x) {
				System.out.print(ar[i] + " ");
			}
		}
		sc.close();
	    	
	}
}