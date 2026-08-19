class Solution {
    public int maximumLengthSubstring(String s) {
        int n= s.length();
        int max = 0;
        int[] freq = new int[26];
        int left=0;
        for(int right=0;right<n;right++){
            int ind = s.charAt(right) - 'a';
            freq[ind]++;
            while(freq[ind] > 2){
                int leftind = s.charAt(left) - 'a';
                freq[leftind]--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}