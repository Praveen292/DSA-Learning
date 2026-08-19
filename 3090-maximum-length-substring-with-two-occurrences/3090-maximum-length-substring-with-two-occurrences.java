class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str = s.substring(i,j+1);
                int m = str.length();
                int[] freq = new int[26];
                boolean isValid = true;
                for(int k=0;k<m;k++){
                  int ind = str.charAt(k) - 'a';
                  freq[ind]++;
                  if(freq[ind] > 2){
                    isValid = false;
                    break;
                  }
                }
                if(isValid){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
} 