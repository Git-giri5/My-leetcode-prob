class Solution {
    public int pivotIndex(int[] nums) {
        int l=0;
        int t=0;
        for(int i:nums){
            t+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(l==t-l-nums[i]){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}