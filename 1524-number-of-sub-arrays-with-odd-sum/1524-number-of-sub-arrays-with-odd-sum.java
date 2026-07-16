class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int even = 1,odd = 0,psum = 0;
        long ans = 0;
        for(int i=0;i<arr.length;i++){
            psum += arr[i];
            if(psum % 2 == 0){
                ans = (ans + odd) % mod;
                even++;
            }
            else{
                ans = (ans + even) % mod;
                odd++;
            }
        }
        return (int)ans;
    }
}