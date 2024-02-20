import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 문제 A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35 
		//A는 65 Z는 90 (아스키코드) - 55 해주기
		
		String N = sc.next(); 
		int B = sc.nextInt(); 
		
		int last = 1;
		int result = 0;
		
		for(int i=N.length()-1; i>=0; i--) {
			char c = N.charAt(i);
			if (c >= 'A' && c <= 'Z') {	
				result += (c-55)*last;
			}else {
				result += (c-48)*last;
			}
			last *= B;
		}
		System.out.println(result);
	}
}
