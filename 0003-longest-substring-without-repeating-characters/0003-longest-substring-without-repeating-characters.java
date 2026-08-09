class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++){
            boolean[] seen = new boolean[128];
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(seen[ch]){
                    break;
                }
                seen[ch] = true;
                int len = j-i+1;
                max = Math.max(len,max);

            }
            
        }
        return max;

    }
}