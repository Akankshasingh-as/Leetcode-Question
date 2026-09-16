class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       /* for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            nums[index] = -Math.abs(nums[index]);
        }
        List<Integer>result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
        */

         List<Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
        
    }
}