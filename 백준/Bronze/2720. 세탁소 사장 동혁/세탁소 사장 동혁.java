import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스의 수
		
		int Q = 25;
		int D = 10;
		int N = 5;
		int P = 1;

			for(int i=0; i<T; i++) {
				int C = sc.nextInt();

				System.out.print( C/Q +" ");
				System.out.print((C%Q)/D +" ");
				System.out.print(((C%Q)%D)/N +" ");
				System.out.println((((C%Q)%D)%N)/P);
				
			}
					

	}
}
