import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); 
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		if(A==B && B==C && A==C) {
			int money = 10000+A*1000;
			System.out.println(money);
		}else if(A==B || B==C || A==C) {
			if(A==B && A!=C) {
				int money = 1000+A*100;
				System.out.println(money);
			}else if(B==C && A!=C) {
				int money = 1000+B*100;
				System.out.println(money);
			}else {
				int money = 1000+C*100;
				System.out.println(money);
			}
		}else {
			if(A>B && A>C) {
				int money = A*100;
				System.out.println(money);
			}else if(B>A && B>C) {
				int money = B*100;
				System.out.println(money);
			}else {
				int money = C*100;
				System.out.println(money);
			}
		}
		
	}
}