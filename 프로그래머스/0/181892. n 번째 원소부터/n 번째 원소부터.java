class Solution {
    public int[] solution(int[] num_list, int n) {
        int x = num_list.length-n+1;
        int[] answer = new int[x];
        
        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - n + 1] = num_list[i];     
        }
        
        return answer;
    }
}