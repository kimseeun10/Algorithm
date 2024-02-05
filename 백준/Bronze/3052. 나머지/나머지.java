import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[10];
		
		for(int i=0; i<10; i++) {
			ar[i] = sc.nextInt()%42;	
			
		}
		
		int count = 1;
		Arrays.sort(ar); // 나머지 배열 오름차순 정렬
		
		for(int i = 0; i< 9; i++) {
			if(ar[i] != ar[i+1]) {
				count++;
			}		
		}
		
		System.out.println(count);
		
		sc.close();
		
	}
	
}
