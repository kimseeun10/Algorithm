import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
		int n = sc.nextInt();
		int a;
		int count = 0;
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		if(n == -1) {
			break;
		}
		
		for(int i=1; i<=n; i++) {
				
				if(n%i == 0 && n/i != n) {
					a = n/i;
					arr.add(a);
					count++;
				}
			}
				
		
		for(int j=0; j<arr.size(); j++) {
			
			sum += arr.get(j);
		}

		Collections.sort(arr);
		
		if(n == sum) {
			System.out.print(n+" = ");
			for(int i=0; i<arr.size(); i++) {
				if(i == arr.size()-1) {
					System.out.println(arr.get(i));
				}else {
					System.out.print(arr.get(i) + " + ");
				}
			}
		}else{
			System.out.println(n+ " is NOT perfect.");
		}

		}

	}
}