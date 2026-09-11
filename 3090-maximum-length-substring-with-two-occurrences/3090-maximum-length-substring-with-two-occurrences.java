class Solution {
    public int maximumLengthSubstring(String s) {
        int []count = new int[26];
        int left = 0;
        int ans  = 0;
        for(int i =0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            while(count[s.charAt(i)-'a']>2){
                count[s.charAt(left)-'a']--;
                left++;
            }
            ans = Math.max(ans , i - left +1);

        }
        return ans;
    }
}