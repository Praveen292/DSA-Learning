class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int count = 0,max_ans = 0;
        int i = 0;
       for(i = 0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                max_ans = Math.max(max_ans,count);
                count = 0;
            }
        }
        return Math.max(max_ans,count);
    }
}