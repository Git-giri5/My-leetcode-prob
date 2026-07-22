/* My code time limit exist
class Solution {
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
// Ai code
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}