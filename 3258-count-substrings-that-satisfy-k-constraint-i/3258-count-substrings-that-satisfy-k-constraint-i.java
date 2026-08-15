class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int zerocount = 0,onecount = 0;
        int count  = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            onecount = 0;
            zerocount = 0;
            for(int j=i;j<n;j++){
                if(s.charAt(j)=='1'){
                    onecount++;
                }
                else{
                    zerocount++;
                }
                if(onecount <= k || zerocount <= k){
                    count++;
                }
            }
         }  
        return count;
     }
}