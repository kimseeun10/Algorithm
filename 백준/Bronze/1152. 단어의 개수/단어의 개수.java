import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String S = sc.nextLine().trim(); // 공백제거
		// 단어의 개수 출력
		
		String [] s = S.split(" ");
		
		if(S.isEmpty() == false) {
			System.out.println(s.length);
		}else {
			System.out.println(0);
		}
		
		sc.close();
		
	}
	
}