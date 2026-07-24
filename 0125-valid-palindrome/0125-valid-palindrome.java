class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String str = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str += Character.toLowerCase(ch);
            }
        }
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);

    }
}