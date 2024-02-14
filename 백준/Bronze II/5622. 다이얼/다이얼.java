import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String word = sc.next();
		int sec = 0;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) >=65 && word.charAt(i) <=67) {
				sec += 3;
			}else if(word.charAt(i) >=68 && word.charAt(i) <=70) {
				sec += 4;
			}else if(word.charAt(i) >=71 && word.charAt(i) <=73) {
				sec += 5;
			}else if(word.charAt(i) >=74 && word.charAt(i) <=76) {
				sec += 6;
			}else if(word.charAt(i) >=77 && word.charAt(i) <=79) {
				sec += 7;
			}else if(word.charAt(i) >=80 && word.charAt(i) <=83) {
				sec += 8;
			}else if(word.charAt(i) >=84 && word.charAt(i) <=86) {
				sec += 9;
			}else if(word.charAt(i) >=87 && word.charAt(i) <=90) {
				sec += 10;
			}
			
		}
		
		System.out.println(sec);
		
		sc.close();
	}
	
}