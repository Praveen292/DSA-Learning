class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int mindif = Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int min = nums[i];
            int max = nums[i+k-1];

            int diff = max - min;

            if(diff < mindif){
                mindif = diff;
            }
        }
        return mindif;
    }
}