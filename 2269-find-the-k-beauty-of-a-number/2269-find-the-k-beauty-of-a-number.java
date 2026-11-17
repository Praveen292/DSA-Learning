
class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String s = str.substring(i,j+1);
                if(s.length() == k){
                    int ans = Integer.parseInt(s);
                    if(ans !=0 && num%ans == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}