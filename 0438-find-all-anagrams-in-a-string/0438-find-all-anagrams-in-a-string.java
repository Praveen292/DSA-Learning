class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        for(int i=0;i<=n-m;i++){
            String str = s.substring(i,i+m);
            int[] count1 = new int[26];
            int[] count2 = new int[26];
            for(int j=0;j<m;j++){
                count1[str.charAt(j) - 'a']++;
            }
            for(int j=0;j<m;j++){
                count2[p.charAt(j) - 'a']++;
            }
            boolean anagram = true;
            for(int j=0;j<26;j++){
                if(count1[j] != count2[j]){
                    anagram = false;
                    break;
                }

            }
            if(anagram){
                arr.add(i);
            }
        }
        return arr;
    }
}   