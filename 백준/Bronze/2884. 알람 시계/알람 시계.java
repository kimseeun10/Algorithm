import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();

		sc.close();
		
		if(H == 0) {
			H = 24;
			int hour = (((H*60)+M)-45)/60;
			int min = (((H*60)+M)-45)%60;
			if(hour == 24) {
				hour = 0;
				System.out.println(hour + " " +min);
			}else {
				hour = (((H*60)+M)-45)/60;
				System.out.println(hour + " " + min);
			}
		}else {
			int hour = (((H*60)+M)-45)/60 ;
			int min = (((H*60)+M)-45)%60;
			System.out.println(hour + " " + min);
		}
		
		
	}
}