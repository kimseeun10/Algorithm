import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next(); // 단어 S
		int i = sc.nextInt(); // 정수 i
		
			
		System.out.println(S.charAt(i-1));
			
		sc.close();
		
	}
	
}
