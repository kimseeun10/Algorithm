import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String w = sc.next().toUpperCase();
		int s[] = new int [26]; // a ~ z 까지 배열 생성
		
		int index; // 배열 위치를 찾기 위한 변수
		for(int i=0; i<w.length(); i++) { // 문자열 길이만큼 반복문 실행 -> 입력 문자열 한 글자씩 해당 알파벳 순서의 int 배열 s 값 증가
			index = w.charAt(i) - 65; // 만약 charAt(i) 가 'A'라면 65-65 = 0으로 s배열 0번째 값 증가
			s[index]++;
			
		}
		
		int count = 0;
		char answer = '?';
		
		for(int i=0; i<s.length; i++) { // 중복값이 가장 큰 값을 비교하며 count에 저장
			if(count < s[i]) { // 0보다 큰 s[i]값이면 그 값을 count에 저장 
				count = s[i];
				answer = (char)(i+'A'); // i가 1이면 1+65 = 66 => answer는 B를 의미 
			}else if(count == s[i]) { // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우 ? 출력
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
