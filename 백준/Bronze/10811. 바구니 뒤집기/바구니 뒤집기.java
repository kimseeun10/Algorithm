import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 갯수 N개
		int M = sc.nextInt(); // 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법 주어짐 (i,j)
		// 왼쪽부터 i번째 바구니부터 j번째 바구니 순서 역순으로
		int [] ar = new int[N];
		
		for(int i=0; i<N; i++) {
			ar[i] = i+1; // 바구니 번호 1부터 N번까지			
		}

		for(int a=0; a<M; a++) { // M개의 줄
			int i = sc.nextInt() -1;
			int j = sc.nextInt() -1;

			while(i < j) {
				int temp = ar[i];
				ar[i++] = ar[j];
				ar[j--] = temp;
			}
		}
		
		for(int c=0; c<N; c++) {
			System.out.print(ar[c] + " ");
		}
		
		sc.close();
		
	}
	
}
