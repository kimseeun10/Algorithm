import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();

		int b = 4;
		int cycle = N/b;
		String word = "long";
		String last = "int";
		
		for(int i = 1; i<=cycle; i++) {
			if(i == cycle) {			
				System.out.println(word+ " " + last);
			}else {
				System.out.println(word);
				
			}
		}
		
	}
}
