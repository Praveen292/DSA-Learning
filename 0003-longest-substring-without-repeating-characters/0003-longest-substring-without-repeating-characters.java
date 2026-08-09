class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        int n = s.length();
        int[] seen = new int[128];
        for(int right = 0;right < n;right++){
            char ch = s.charAt(right);
            if(seen[ch] > 0){
                left = Math.max(left,seen[ch]);
            }
            seen[ch] = right + 1;
            int len = right-left+1;
            max = Math.max(len,max);
        }
        return max;
    }
}