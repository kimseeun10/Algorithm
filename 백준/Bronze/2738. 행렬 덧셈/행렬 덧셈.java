import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 행렬의 크기
		int M = sc.nextInt();

		int A[][] = new int [N][M];
		int B[][] = new int [N][M];
		int sum[][] = new int [N][M];
		
		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				A[i][k] = sc.nextInt();
				
			}
			
		}
		
		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				B[i][k] = sc.nextInt();
			}
			
		}
		
		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				sum[i][k] = A[i][k] + B[i][k];
			}
			
		}
		
		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				System.out.print(sum[i][k] + " ");
			}
			System.out.println();
		}		
	}
}