import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt(); // 색종이의 수 (색종이는 10*10 크기)
		int n[][] = new int[100][100]; // 가로 세로 크기가 각 100인 정사각형 도화지
		
		for(int i=0; i<count; i++) {
			int x = sc.nextInt(); // x축
			int y = sc.nextInt(); // y축
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					n[j][k] = 1; // 정사각형 크기만큼 1로 채워줌 겹치는 부분도 계속 1임
				}
			}
		}
		
		int result = 0;
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(n[i][j] == 1) {
					result += n[i][j];
				}
			}
		}
		System.out.println(result);
	}
}
