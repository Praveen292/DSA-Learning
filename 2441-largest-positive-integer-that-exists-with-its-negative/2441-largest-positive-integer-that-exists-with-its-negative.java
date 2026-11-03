class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(nums[i] != -nums[j]){
                    continue;
                }
                max = Math.max(nums[j],max);
            }
        }
        if(max == Integer.MIN_VALUE){
            return -1;
        }
        else{
            return max;
        }
    }
}  