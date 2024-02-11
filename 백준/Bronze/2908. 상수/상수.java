import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = 0;
		int b = 0;
		
		while(A != 0) {
			a = a * 10 + A % 10;
			A /= 10;
		}
		
		while(B != 0) {
			b = b * 10 + B % 10;
			B /= 10;
		}
		
		if(a > b) {
			System.out.println(a);
		}else if(b > a) {
			System.out.println(b);
		}
	}
	
}
