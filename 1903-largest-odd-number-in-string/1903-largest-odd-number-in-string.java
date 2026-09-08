class Solution {
    public String largestOddNumber(String num) {
        int n  = num.length();
        int j = n-1;
        String ans = "";
        while(j>=0){
            if(num.charAt(j) % 2 != 0){
                ans = num.substring(0,j+1);
                return ans;
            }
            j--;
        }
        return ans;
    }
}