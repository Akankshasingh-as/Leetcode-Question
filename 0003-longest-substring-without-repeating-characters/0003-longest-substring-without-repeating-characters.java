class Solution {
    public int lengthOfLongestSubstring(String s) {
    int l =0;
    int r =0;
    int max =0;
    StringBuilder sb = new StringBuilder();
    while(r<s.length()){
        while(sb.indexOf(s.charAt(r)+"")>=0){
            sb.deleteCharAt(0);
            l++;
        }
        sb.append(s.charAt(r));
        max = Math.max(max , r-l+1);
        r++;
    }
    return max;
    }
}