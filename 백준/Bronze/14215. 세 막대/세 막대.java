import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int ar[] = new int[3];
            ar[0] = sc.nextInt();
            ar[1] = sc.nextInt();
            ar[2] = sc.nextInt();
            
            int minus = 0;
            int t = 0;
            int r = 0;
            
            Arrays.sort(ar);
            
            if(ar[2] < ar[0] + ar[1]) {
            	System.out.println(ar[0]+ar[1]+ar[2]);
            }else if(ar[2] >= ar[0]+ar[1]) {
            	
            	minus = ar[2] - (ar[0]+ar[1]);
            	t = (ar[2]-minus-1);
            	r = t + (ar[0]+ar[1]);
            	
            	System.out.println(r);
            }else if(ar[0] == ar[1] && ar[1] == ar[2]) {
            	System.out.println(ar[0]+ar[1]+ar[2]);
            }
            
        sc.close();
    }
}