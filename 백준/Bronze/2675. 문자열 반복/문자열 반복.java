import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int T = sc.nextInt(); // 테스트 케이스
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt(); // 반복 횟수
			String S = sc.next();
			String P [] = S.split("");
			
			for(int k=0; k<S.length(); k++) {
				
				for(int j=0; j<R; j++) {
					
					System.out.print(P[k]);
				}
			}
            System.out.println();
		}
		

		sc.close();
		
	}
	
}