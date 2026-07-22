class Solution {
    public int thirdMax(int[] nums) {
        int n  = nums.length;
        long fmax = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(nums[i] == fmax || nums[i] == smax || nums[i] == tmax){
                continue;
            }
            if(nums[i] > fmax){
               tmax = smax;
               smax = fmax;
               fmax = nums[i];
            }
            else if(nums[i] > smax){
                tmax = smax;
                smax = nums[i];
            }
            else if(nums[i] > tmax){
                tmax = nums[i];
            }
        }
        if(tmax == Long.MIN_VALUE){
            return (int)fmax;
        }
        else{
            return (int)tmax;
        }
    }
}