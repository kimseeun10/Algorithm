import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String w = sc.next();
		String a[] = {"c=","c-","dz=","d-","lj","nj","s=","z="}; 
		
		for(int i=0; i<a.length; i++) {
			
			if(w.contains(a[i])) { // w에 a[i]값이 포함되었는지 확인 후 있으면 "@"로 바꿔서 문자 길이 출력
				w = w.replace(a[i], "@");
			}
			
		}
		System.out.println(w.length());
	}
}
