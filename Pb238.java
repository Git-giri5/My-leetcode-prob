class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int pref=1;
        for(int i=0;i<nums.length;i++){
            answer[i]=pref;
            pref*=nums[i];
        }
        int suff=1;
        for(int i=nums.length-1;i>=0;i--){
            answer[i]*=suff;
            suff*=nums[i];
        }
    
        return answer;
    }
}