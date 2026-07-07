class Solution {
    public int longestOnes(int[] nums, int k) {
       int max_ans = 0;
       int count = 0;
       int n = nums.length;
       for(int i = 0;i<n;i++){
        count  = 0;
        for(int j=i;j<n;j++){
           if(nums[j]==0){
            count++;
           }
           if(count > k){
    
            break;
           } 
            max_ans = Math.max(max_ans,j-i+1);
        }
       }
       return max_ans; 
    }
}