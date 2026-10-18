class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] > threshold || nums[i] % 2 != 0){
                continue;
            }
            for(int j=i;j<n;j++){
                if(nums[j] > threshold){
                    break;
                }
                if(j>i && nums[j]%2 == nums[j-1]%2){
                    break;
                }
                int len = j-i+1;
                max = Math.max(len,max);
            }
        }
        return max;
           
    }
}  