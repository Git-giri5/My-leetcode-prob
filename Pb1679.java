class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int l=0,r=nums.length-1;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==k){
                c+=1;
                l++;
                r--;
            }else if(sum<k){
                l++;
            }else{
                r--;
            }
        }
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k){
                    c+=1;
                    nums[i]=0;
                    nums[j]=0;
                }else{
                    continue;
                }
            }
        }*/
        
        return c;
    }
}