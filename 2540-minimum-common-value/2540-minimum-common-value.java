class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int l = 0,r = 0;
        int minval = Integer.MAX_VALUE;
        while(l < n && r < m){
            if(nums1[l] == nums2[r]){
                return nums1[l];
                
            }
            else if(nums1[l] < nums2[r]){
                l++;
            }
            else{
                r++;
            }
            
        }
        return -1;
    }
}