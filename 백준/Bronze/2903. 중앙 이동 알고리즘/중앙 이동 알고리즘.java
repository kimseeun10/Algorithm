import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		double number = 2; // 2+1 4+1 8+1 16+1 32+1 
		double result = 0;
		
		for(int i=1; i<=N; i++) {
			double n = Math.pow(number, i)+1;
			result = n*n;
			
			}
		System.out.println((int)result);  
		
		br.close();
		
		}
		

	}
