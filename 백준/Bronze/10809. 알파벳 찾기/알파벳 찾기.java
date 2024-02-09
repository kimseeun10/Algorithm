import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int [] ar = new int [26]; 
		String S = sc.next();
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = -1;
		}
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			
			if(ar[ch - 'a'] == -1) { // ar원소 값이 -1인 경우에만 초기화
				ar[ch - 'a'] = i;
			}
		}
		
		for(int i:ar) {
			System.out.print(i + " ");
		}
		sc.close();
		
	}
	
}
