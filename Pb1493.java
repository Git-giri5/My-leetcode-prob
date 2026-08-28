class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,m=0,zeroco=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroco++;
            }
            while(zeroco>1){
                if(nums[l]==0){
                    zeroco--;  
                }
                l++;
            }
            m=Math.max(m,i-l);
        }
        return m;
    }
}
//counting no of zeros
