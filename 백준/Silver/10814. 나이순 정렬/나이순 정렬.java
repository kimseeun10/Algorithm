import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] x = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            x[i][0] = input[0]; // 숫자 부분
            x[i][1] = input[1]; // 문자 부분
        }

        Arrays.sort(x, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
            	return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(x[i][0] + " " + x[i][1]);
        }
    }
}