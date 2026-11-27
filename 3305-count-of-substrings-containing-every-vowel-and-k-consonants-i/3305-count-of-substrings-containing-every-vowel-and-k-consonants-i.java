class Solution {
    public int countOfSubstrings(String word, int k) {
        int n =  word.length();
        int count  = 0;
        for(int i=0;i<n;i++){
            int cons = 0;
            int a = 0,e = 0,li = 0,u = 0,o = 0;

            for(int j=i;j<n;j++){
                char ch = word.charAt(j);

                if(ch == 'a'){
                    a++;
                }
                else if(ch == 'e'){
                    e++;
                }
                else if(ch == 'i'){
                    li++;
                }
                else if(ch == 'o'){
                    o++;
                }
                else if(ch == 'u'){
                    u++;
                }
                else{
                    cons++;
                }

                if(a > 0 && e > 0 && u > 0 && li > 0 && o > 0 && cons == k){
                    count++;
                }
            }
        }
        return count;
    }
}