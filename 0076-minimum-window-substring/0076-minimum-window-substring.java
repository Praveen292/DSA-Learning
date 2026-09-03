class Solution {
    public String minWindow(String s, String t) {
       int n = s.length();
       int[] freq = new int[128];
       for(int i=0;i<t.length();i++){
        freq[t.charAt(i)]++;
       }
       int left = 0;
       int count = 0;
       int right = 0;
       int minlen = Integer.MAX_VALUE;
       int start = 0;
       for(right = 0;right<n;right++){
         char ch = s.charAt(right);
         if(freq[ch] > 0){
            count++;
         }
         freq[ch]--;
         while(count == t.length()){
            if(right-left+1 < minlen){
                minlen = right - left + 1;
                start = left;
            }
            char leftchar = s.charAt(left);
            freq[leftchar]++;
            if(freq[leftchar] > 0){
                count--;
            }
            left++;
         }
       }
       if(minlen == Integer.MAX_VALUE){
        return "";
       }
       return s.substring(start,minlen + start); 
    }
}