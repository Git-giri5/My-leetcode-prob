//time complexity is high 45ms
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
    }
}
//less time xomplexity code 2ms
/*class Solution {
    public void moveZeroes(int[] nums){
        int n=nums.length,r=0;
        if(n==1 && nums[0]==0) return;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[r++]=nums[i];
            }
        }
        while(r<n){
            nums[r++]=0;
        }
    }
}*/