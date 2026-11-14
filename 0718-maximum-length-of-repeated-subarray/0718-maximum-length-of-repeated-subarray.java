class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int count = 0;
        int max = 0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
              int x = i;
              int y = j;
              count  = 0;
              while(x <n1 && y <n2){
                if(nums1[x]==nums2[y]){
                    count++;
                    x++;
                    y++;
                }
                else{
                    break;
                }
              }
              max = Math.max(count,max); 
            }
        }
        return max;
    }
}