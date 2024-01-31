import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();
		
			int hour = (((A*60)+B+C)/60)%24;
			int min = (((A*60)+B+C))%60;
			System.out.println(hour +" "+min);
		
		
	}
}
