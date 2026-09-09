class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int []arr = new int [n];
        Arrays.fill(arr , -1);
        int l = 0;
        int r = 0;
        int w  = 2*k + 1;
        long sum = 0;
        if(w>n){
            return arr;
        }
        while(r<w){
            sum += nums[r];
            r++;
        }
        arr [k++] =(int)( sum / w);
        while(r<n){
            sum += nums[r];
            sum -= nums[l];
            arr [k++] =(int)( sum / w);
            l++;
            r++;
        }
        return arr;
        
    }
}