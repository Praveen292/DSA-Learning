class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int r = 0,l=0;
        double sum = 0;
        double max = Integer.MIN_VALUE;
        while(r < n){
            sum += nums[r];
            if(r-l+1 == k){
                double avg = sum/k;
                max = Math.max(avg,max);
                sum -= nums[l];
                l++;
            }
            
            r++;
        }
        return max;
        
    }
}