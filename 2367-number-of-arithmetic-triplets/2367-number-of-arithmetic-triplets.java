class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int j = i+1;
            while(j<n && nums[j] - nums[i] < diff){
                j++;
            }
            if(j<n && nums[j] - nums[i] == diff){
                int k= j+1;

                while(k<n && nums[k] - nums[j] < diff){
                    k++;
                }
                if(k<n && nums[k] - nums[j] == diff){
                    count++;
                }
            }
        }
        return count;
    }
}