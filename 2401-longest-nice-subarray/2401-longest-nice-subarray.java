class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int or = 0;
        int l = 0;
        int r = 0;
        int Nicemax = Integer.MIN_VALUE;
        for(r=0;r<n;r++){
            while((or & nums[r]) != 0){
                or = or ^ nums[l];
                l++;
            }

            or = or | nums[r];

            Nicemax = Math.max(Nicemax,r-l+1);

        }
        return Nicemax;
    }
}