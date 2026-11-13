class Solution {
    public int countSegments(String s) {
        String[] word = s.trim().split("\\s+");
        if(s.trim().isEmpty()){
            return 0;
        }
        
        return word.length;

    }
}