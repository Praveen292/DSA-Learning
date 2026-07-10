class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;
        int i = 0;
        HashSet <Integer> set = new HashSet<>();
        for(i = 0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}