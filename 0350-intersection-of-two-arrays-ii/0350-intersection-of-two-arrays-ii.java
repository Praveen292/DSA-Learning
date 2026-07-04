class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans = new int[n];
        int l = 0,r = 0,k=0;
        while(l < n && r < m){
            if(nums1[l]==nums2[r]){
                ans[k] = nums1[l];
                k++;
                l++;
                r++;
            }
            else if(nums1[l] < nums2[r]){
                l++;
            }
            else{
                r++;
            }
        }
        return Arrays.copyOf(ans,k);
    }
}