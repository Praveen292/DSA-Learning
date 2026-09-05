class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] res = new boolean[n];
        res[0]  =  true;
        for(int i=0;i<n;i++){
            if(res[i]){
                for(int jump=0;jump <= nums[i];jump++){
                    int next = i + jump;
                    if(next < n){
                        res[next] = true;
                    }
                }
            }
        }
        return res[n-1];
    }
}