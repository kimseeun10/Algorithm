import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] st = new int[30];
		int [] ok = new int[28];
		int num = 1;
		
		for(int i=0; i<st.length; i++) { // 0부터 29번까지 30개 0번부터 1 ~ 30까지 값 넣음
			st[i] = i+1;
		}
		
		for(int i=0; i<ok.length; i++) { // 0부터 27번까지 28개 번호 넣음 
			ok[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<30; i++) { // 30개 도는 동안 28개 돌려서 30개 안에 있는 값이 28개 안에 있으면 st[i] 값을 0으로 초기화
			for(int j = 0; j<28; j++) {		
				if(st[i] == ok[j]) {
					st[i] = 0;
				}
			}
		}
		
		for(int i=0; i<30; i++) { // 배열 0번부터 29번까지에서 0이 아닌 값이 있는 거
			if(st[i] != 0) {
				System.out.println(st[i]);
			}
		}
		
		
		sc.close();
		
	}
	
}
