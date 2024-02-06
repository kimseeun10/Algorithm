import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 과목의 개수
		int [] ar = new int[N]; // 현재 성적
		double [] ar2 = new double[N]; // 수정된 성적
		double max = ar[0];
		
		for(int i=0; i<N; i++) {
			ar[i] = sc.nextInt(); // 성적 입력받음
		}
		
		double sum = 0.0;
		//입력 받은 성적 중 최댓값 찾기
		for(int i=0; i<N; i++) {
			if(max<ar[i]) { // max보다 ar[i] 가 크면 max = ar[i]
				max = ar[i];
			}

		}
		
		for(int i=0; i<N; i++) {
			ar2[i] = ar[i]/max*100;
			sum += ar2[i];
		}
		double avg = sum/N;
		
		System.out.println(avg + " ");
		
		sc.close();
		
	}
	
}
