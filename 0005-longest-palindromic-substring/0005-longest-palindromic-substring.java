class Solution {
    public String longestPalindrome(String s) {
        String str = "";
        int n = s.length();
        int max = 0;
        String ans = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                str = s.substring(i,j+1);
                int l = 0;
                int r = str.length()-1;
                boolean isPalindrome = true;
                while(l<r){
                    if(str.charAt(l) != str.charAt(r)){
                         isPalindrome = false;
                         break;
                    }
                    l++;
                    r--;
                }
                if(isPalindrome && str.length() > max){
                    max = str.length();
                    ans = str;
                }
            }
        }
        return ans;
    }
}