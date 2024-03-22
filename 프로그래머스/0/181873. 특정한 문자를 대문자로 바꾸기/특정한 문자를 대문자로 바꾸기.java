class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String upper = alp.toUpperCase();
        if(my_string.contains(alp)){
            answer = my_string.replace(alp, upper);
        }else {
            answer = my_string;
        }
        
        return answer;
    }
}