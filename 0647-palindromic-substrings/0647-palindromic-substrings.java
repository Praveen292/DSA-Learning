class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        boolean isPalindrome = true;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int l = i,r = j;
                isPalindrome = true;
                while(l < r){
                    if(s.charAt(l) != s.charAt(r)){
                        isPalindrome = false;
                        break;
                    }
                    l++;
                    r--;
                }
                if(isPalindrome){
                    count++;
                }
            }
        }
        return count;
    }
}