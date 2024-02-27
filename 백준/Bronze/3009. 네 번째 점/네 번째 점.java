import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		ArrayList<Integer> arx = new ArrayList<Integer>();
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		for(int i=0; i<3; i++) {
			x = sc.nextInt();
			y = sc.nextInt();	
			arx.add(x);
			ary.add(y);
		}
		
		if(arx.get(0).equals(arx.get(1))) {
			x = arx.get(2);
		}else if(arx.get(1).equals(arx.get(2))) {
			x = arx.get(0);
		}else {
			x = arx.get(1);
		}
		
		
		if(ary.get(0).equals(ary.get(1))) {
			y = ary.get(2);
		}else if(ary.get(1).equals(ary.get(2))) {
			y = ary.get(0);
		}else {
			y = ary.get(1);
		}
		
		System.out.println(x + " " + y);
		
    }
}
