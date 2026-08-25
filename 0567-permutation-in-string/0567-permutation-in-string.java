class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int k = s1.length();
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorts1 = new String(arr1);
        for(int i=0;i<=n-k;i++){
            String str = s2.substring(i,i+k);
            char[] arr2 = str.toCharArray();
            Arrays.sort(arr2);
            String sortstr = new String(arr2);
            if(sorts1.equals(sortstr)){
                return true;
            }
        }
        return false;
    }
}