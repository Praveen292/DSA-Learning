class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int count = 0,max_ans = 0;
        int j= 0;
        while(j<n){
            if(nums[j] == 1){
                count++;
                j++;
            }
            else{
                max_ans = Math.max(max_ans,count);
                count = 0;
                j++;
            }
        }
        return Math.max(max_ans,count);
    }
}