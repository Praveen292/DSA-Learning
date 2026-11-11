class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        int[] freq = new int[2001];
        for(int i=0;i<n;i++){
            freq[arr[i] + 1000]++;
        }
        int m = freq.length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(freq[i]>0 && freq[j] > 0 && freq[i]== freq[j]){
                    return false;
                }
            }
        }
        return true;
    }
}