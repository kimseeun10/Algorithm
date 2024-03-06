import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

			for(int i=M; i<=N; i++) {
				boolean check = true;
				if(i < 2) { // M 또는 N이 1이면 지나감
					continue;
				}

				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j == 0) { // i를 j(2이상의 숫자로 나누었을 때 나머지가 없으면 false)
						check = false;
						break;
					}
				}
				
				if(check) { // check가 true일때 arr에 i값을 넣어줌, count 늘리기
					arr.add(i);
					count++;
				}
			}
			
			int sum = 0;
			Collections.sort(arr); // arr 정렬
			
			if(arr.size() > 0) {
				
				for(int i=0; i<count; i++) { // 0번 부터 count 까지 더하기 
					sum += arr.get(i);
				}
				System.out.println(sum);
				System.out.println(arr.get(0)); // 최솟값
				
			}else {
				System.out.println(-1);
			}
		
	}
}