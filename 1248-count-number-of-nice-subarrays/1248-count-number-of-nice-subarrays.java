class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return CountAtmost(nums,k) - CountAtmost(nums,k-1);
    }
    public int CountAtmost(int nums[],int k){
        int left = 0,right = 0,oddcount = 0;
        int n = nums.length;
        int count = 0;
        for(right = 0;right<n;right++){
            if(nums[right]%2 != 0){
                oddcount++;
            }
            while(oddcount > k){
                if(nums[left] %2 !=0){
                    oddcount--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}