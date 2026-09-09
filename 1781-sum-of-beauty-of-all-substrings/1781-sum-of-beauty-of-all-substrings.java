class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        int max = 0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str = s.substring(i,j+1);
                 int[] freq = new int[128];
                for(int k = 0;k<str.length();k++){
                    freq[str.charAt(k) - 'a']++;
                }
                int min = Integer.MAX_VALUE;
                max = 0;
                for(int k=0;k<26;k++){
                if(freq[k] > 0){
                    max = Math.max(freq[k],max);
                    min = Math.min(freq[k],min);
                   
                }
            }
            sum += max-min;
          
        }
    }
    return sum;
    }
}
               