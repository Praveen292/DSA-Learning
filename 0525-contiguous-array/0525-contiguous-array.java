class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int psum  = 0;
        map.put(0,-1);
        int maxlen = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                psum += -1;
            }
            else{
                psum += 1;
            }
            if(map.containsKey(psum)){
                int len = i - map.get(psum);
                if(len > maxlen){
                    maxlen = len;
                }
            }
            else{
                map.put(psum,i);
            }
        }
        return maxlen;
    }
}