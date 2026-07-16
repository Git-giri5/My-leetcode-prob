//in leet code time limit exceeds
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((nums[i]<nums[j])&&(nums[j]<nums[k])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// Modified code for O(n) complextiy
/*class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fst=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=fst){
                fst=num;
            }else if(num<=second){
                second=num;
            }else{
                return true;
            }
        }
        return false;
    }
}*/