class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int max = -1; 
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str  = s.substring(i,j+1);
                boolean special = true;
                for(int k=1;k<str.length();k++){
                    if(str.charAt(k) != str.charAt(0)){
                        special = false;
                        break;
                    }
                }
                if(special){
                    int count = 0;
                    for(int x = 0;x<=n-str.length();x++){
                        String sub = s.substring(x,x+str.length());
                        if(sub.equals(str)){
                            count++;
                        }
                    }
                    if(count >= 3){
                        max = Math.max(max,str.length());
                    }
                }
            }
        }
        return max;
    }
}