import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A;
		int B; 
		
		while(true) {
			
			A = sc.nextInt(); 
			B = sc.nextInt();
			
			if((A==0) && (B==0)) break;
			
			if(B % A == 0) {
				System.out.println("factor");
			}else if(A % B == 0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");	
			}
			
		}
	
    }
}
