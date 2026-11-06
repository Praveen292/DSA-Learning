class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<k;j++){
                if(nums[i]==temp[j]){
                    count++;
                }
            }
            if(count < 2){
                temp[k] = nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
        return k;
    }
}