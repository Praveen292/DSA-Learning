class Solution {
    public int numberOfSubstrings(String s) {
        int n= s.length();
        int count = 0;
        int[] freq = new int[26];
        int left=0;
        for(int right=0;right<n;right++){
            int ind = s.charAt(right) - 'a';
            freq[ind]++;
            while(freq[0] >= 1 && freq[1] >= 1 && freq[2] >=1){
                int leftind = s.charAt(left) - 'a';
                freq[leftind]--;
                left++;
            }
           count += left;
        }
        return count;
    }
}