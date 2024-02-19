import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char [][] ch = new char[5][15]; // 세로 5줄 가로 15줄 배열
		
		for(int i=0; i<5; i++) {
			String w = sc.nextLine();
			
			for(int j=0; j<w.length(); j++) { //w의 길이만큼 j배열 수 늘어남 (최대 15까지)
				ch[i][j] = w.charAt(j);
			}
		}
		
		for(int j=0; j<15; j++) { 
			for(int i=0; i<5; i++) {
				if(ch[i][j] == ' ' || ch[i][j] == '\0') // 문자열이 비어있으면 건너띄고 다음 행의 값 출력
					continue;
				System.out.print(ch[i][j]);
			}
		}
		
	}
}
