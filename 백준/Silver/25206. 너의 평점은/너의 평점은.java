import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
        double L = 0.0; // 등급 점수로 변환
        double sumscore = 0.0;
        double sumL = 0.0;
        double result = 0.0;
        
        for(int i=0; i<20; i++) {
        	
        	String subject = sc.next(); // 전공과목명
        	double score = sc.nextDouble(); // 학점
        	String level = sc.next(); // 등급
        	
        	if(level.equals("A+")) {
        		L = 4.5;
        	}else if(level.equals("A0")) {
        		L = 4.0;
        	}else if(level.equals("B+")) {
        		L = 3.5;
        	}else if(level.equals("B0")) {
        		L = 3.0;
        	}else if(level.equals("C+")) {
        		L = 2.5;
        	}else if(level.equals("C0")) {
        		L = 2.0;
        	}else if(level.equals("D+")) {
        		L = 1.5;
        	}else if(level.equals("D0")) {
        		L = 1.0;
        	}else if(level.equals("F")) {
        		L = 0.0;
        	}
        	
        	if(!level.equals("P")) {
        		sumscore += score; // 학점 합
        		sumL += score*L; // 과목평점 * 학점
        	}
        }

        // 전공평점 = 전공과목별(학점 * 과목평점)의 합을 학점의 총합으로 나눈값 
        // result = sum(socre * level)/sum(score)
        result = sumL/sumscore;
        System.out.println(result);
    }
}