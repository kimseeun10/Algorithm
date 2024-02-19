import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n[][] = new int [9][9]; // 9*9 배열 생성
		int max = 0; // 최대값 담을 변수
		int a=0; // i값 담을 변수
		int b=0; // j값 담을 변수
		
		for(int i=0; i<9; i++) { // 9*9 배열에 값 입력받는 반복문
			for(int j=0; j<9; j++) {
				n[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(n[i][j] >= max) { // 최대값이랑 같거나 더 크다면 
					max = n[i][j]; // max값 업데이트하고
					a = i+1; // 배열은 0부터 시작하니까 +1 하여 행과 열 번호 저장
					b = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(a + " " + b);
	}
}