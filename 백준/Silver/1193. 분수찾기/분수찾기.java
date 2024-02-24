import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int X = sc.nextInt(); // x번째 분수를 구하기
		int count = 1; // 대각선에 있는 칸 개수
		int sum = 0; 

		
		while(true) {
			if(X <= sum + count) {
				if(count % 2 == 1) {
					System.out.println((count-(X-sum-1)+"/"+(X-sum)));
					break;
				}else {
					System.out.println((X-sum)+"/"+(count-(X-sum-1)));
					break;
				}
			}else {
				sum+=count;
				count++;
			}
		}
		
	
        
    }
}
