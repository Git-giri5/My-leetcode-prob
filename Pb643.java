/*class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double m=Double.NEGATIVE_INFINITY;
        for(int i=0;i<=nums.length-k;i++){
            double c=0;
            for(int j=0;j<k;j++){
                c+=nums[i+j];  
            }
            m=Math.max(m,c);
        }
        return m/k;
    }
}*/
