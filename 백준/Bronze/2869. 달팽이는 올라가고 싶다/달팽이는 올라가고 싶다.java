import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt(); // 낮에 올라갈 수 있는 길이
		int B = sc.nextInt(); // 밤에 미끄러지는 길이
		int V = sc.nextInt(); // 높이 V미터
		
		int a = A-B;
		int b = V-A;
		int day = b/a;
		
		if(b%a != 0) {
			day++;
		}
		
		System.out.println(day+1);
        
    }
}
