class Solution {
    public int maxFrequencyElements(int[] nums) {
        int []freq = new int [101];
        for(int num : nums){
            freq[num]++;

        }
        int maxFre = 0;
        for(int f : freq ){
            maxFre = Math.max(maxFre , f);
        }
        int ans =0;
        for(int f : freq){
            if(f == maxFre){
            ans = ans+f;
            }
        }
        return ans;
        
    }
}