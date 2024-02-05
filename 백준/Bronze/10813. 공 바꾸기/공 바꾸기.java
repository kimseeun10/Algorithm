
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 갯수 N개 , 바구니에는 공 1개씩
		int M = sc.nextInt(); // M번 공을 바꿈
		int [] ar = new int[N];
		
		
		for(int i=0; i<N; i++) {
			ar[i] = i+1; // 바구니 번호 1번부터 N번까지 
			
		}
		for(int k=0; k<M; k++) {
			int i = sc.nextInt() -1;
			int j = sc.nextInt() -1;
			int t = 1;
			t = ar[i];
			ar[i] = ar[j];
			ar[j] = t;
		}
		
		for(int i = 0; i<N; i++) {
			System.out.print(ar[i] + " ");
		}

		sc.close();
		
		
		
	}
	
}