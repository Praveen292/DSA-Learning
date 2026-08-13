class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        int max = 0;
        String str = "";            
        String ans = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                str = s.substring(i,j+1);
                int m = str.length();
                boolean nice = true;
                for(int k=0;k<m;k++){
                    char ch = str.charAt(k);
                    if(str.indexOf(Character.toUpperCase(ch))==-1 || str.indexOf(Character.toLowerCase(ch))==-1){
                        nice = false;
                        break;
                    } 
                }
                if(nice && m > max){
                    max = m;
                    ans = str;
                }
            }
        }
        return ans;      
    }
}