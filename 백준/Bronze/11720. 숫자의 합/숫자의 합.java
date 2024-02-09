import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		String a = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += a.charAt(i) - '0'; 
			// charAt()은 해당 문자의 아스키코드 값을 반환하므로 -48 또는 -'0'를 해주어야 함
		}
		
		System.out.println(sum);
			
		sc.close();
		
	}
	
}