import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String W = sc.next();
		int a = 1;
		
		StringBuffer sb = new StringBuffer(W);
		sb.reverse();
		
		for(int i=0; i<W.length()/2; i++) { //길이의 절반이 뒤집힌 문장의 반절과 같으면 1 아니면 0
			if(W.charAt(i) != sb.charAt(i)) {
				a = 0;
			}
		}
		
		System.out.println(a);
		sc.close();
		
	}
	
}
