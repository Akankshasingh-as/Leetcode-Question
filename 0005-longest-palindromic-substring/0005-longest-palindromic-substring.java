class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)return "";
        String max = "";
        for(int i=0;i<s.length();i++){
            int left =i;
            int right = i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                String temp = s.substring(left,right+1);
                if(temp.length()>max.length()){
                    max = temp;
                }
                left --;
                right++;
            }
              left =i;
            right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                String temp = s.substring(left,right+1);
                if(temp.length()>max.length()){
                    max = temp;
                }
                left --;
                right++;
            }
        }
        return max;
        
        
    }
}