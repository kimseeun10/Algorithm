import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int xy = Math.min(x, y); 
		int wh = Math.min((w-x), (h-y));
		
		System.out.println(Math.min(xy, wh));
		
    }
}
