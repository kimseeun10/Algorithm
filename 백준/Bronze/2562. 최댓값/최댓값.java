import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int [] ar = new int [9];
	
	for(int i=0; i<9; i++) {
		ar[i] = Integer.parseInt(br.readLine());
		
	}

	int Max = ar[0];
	int maxCount = 1;

	for(int i = 0 ; i<9; i++) {
		if(ar[i] > Max) {
			Max = ar[i];
			maxCount = i+1;
		}
	}
	bw.write(Max + "\n" + maxCount);

	bw.flush();
	br.close();
	bw.close();
	
	}
}