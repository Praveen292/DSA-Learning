class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int currmax = 0;
        int maxsum = Integer.MIN_VALUE;
        int currmin = 0;
        int minsum = Integer.MAX_VALUE;
        int totsum = 0;
        for(int i=0;i<n;i++){
            currmax = Math.max(nums[i],currmax+nums[i]);
            maxsum = Math.max(maxsum,currmax);
            currmin = Math.min(nums[i],currmin + nums[i]);
            minsum = Math.min(currmin,minsum);
            totsum += nums[i];
        }
        if(maxsum < 0){
            return maxsum;
        }
        return Math.max(maxsum,totsum - minsum);
    }
}