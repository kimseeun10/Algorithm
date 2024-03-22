class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = numLog[0];
        
        for(int i=0; i<numLog.length; i++){
            switch(numLog[i]-num){
                case 1 : answer = answer + 'w';
                    break;
                case -1 : answer += 's';
                    break;
                case 10 : answer += 'd';
                    break;
                case -10 : answer += 'a';
                    break;
            }
        num = numLog[i];
        }
        
        return answer;
    }
}