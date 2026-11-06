class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i<n;i++){
            boolean found = false;
            for(int j=0;j<k;j++){
                if(nums[i]==nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                nums[k] = nums[i];
                k++;

            }
        }
        return k;
        
    }
}