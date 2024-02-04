import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int N = Integer.parseInt(st.nextToken());
	int X = Integer.parseInt(st.nextToken());
	int [] ar = new int [N];
	
	st = new StringTokenizer(br.readLine());
	for(int i=0; i<N; i++) {
		ar[i] = Integer.parseInt(st.nextToken());
	}
	
	for(int i=0; i<N; i++) {
		if(ar[i]<X) {
			bw.write(ar[i] + " ");
		}
	}
	bw.flush();
	br.close();
	bw.close();
	
	}
}