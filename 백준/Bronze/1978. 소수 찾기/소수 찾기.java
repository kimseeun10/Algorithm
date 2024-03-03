import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a = 0;
		int count = 0;
		
		for(int i=1; i<=N; i++) {
			a = sc.nextInt();
			boolean check = true;
			if(a==1) {
				continue;
			}
			for(int j=2; j<=Math.sqrt(a); j++) {
				if(a%j == 0) {
					check = false;
				}
			}
			
			if(check) {
				count++;
			}
		}
        
		System.out.println(count);
        sc.close();
    }
}