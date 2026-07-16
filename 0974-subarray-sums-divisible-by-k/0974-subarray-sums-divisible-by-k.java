class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap <>();
        int psum = 0;
        map.put(0,1);
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            psum += nums[i];
            int rem = psum % k;
            if(rem < 0){
                rem += k;
            }
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}