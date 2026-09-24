class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int leftSum = 0;
        int rightsum = 0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
             sum  = sum + nums[i];
             rightsum  = totalSum - sum;
            leftSum = sum - nums[i];
            if(leftSum == rightsum ){
                return i;
            }
        }
        return -1;
        
    }
}