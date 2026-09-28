class Solution {
    public int maxDepth(String s) {
        int d = 0;
        int maxD = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                d++;
                maxD = Math.max(maxD , d);
            }else if(ch == ')'){
                d--;
            }
        }
        return maxD;
        
    }
}