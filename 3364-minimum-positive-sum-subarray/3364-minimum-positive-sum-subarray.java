class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int sum = 0;
        int min_sum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + nums.get(j);
                if(j-i+1 >= l && j-i+1 <= r && sum > 0){
                    min_sum = Math.min(sum,min_sum);
                }
            }
        }
        if(min_sum == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return min_sum;
        }
    }
}