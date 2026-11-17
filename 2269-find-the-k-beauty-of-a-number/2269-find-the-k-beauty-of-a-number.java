
class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int n = str.length();
        int count = 0;
        for(int i=0;i<=n-k;i++){
           
            String s = str.substring(i,i+k);
            if(s.length() == k){
                int ans = Integer.parseInt(s);
                if(ans !=0 && num%ans == 0){
                    count++;
                }
            }
        }
        return count;
    }
}