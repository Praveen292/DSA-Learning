class Solution {
    public int magicalString(int n) {
        if(n==0){
            return 0;
        }
        if(n <= 3){
            return 1;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;
        int count= 1;
        int read = 2;
        int write = 3;
        while(write < n){
            int grpSize = arr[read];
            int element = arr[write-1] == 1 ? 2 : 1;
            for(int i=0;i<grpSize;i++){
                if(write < n){
                    arr[write] = element;
                    if(element == 1){
                        count++;
                    }
                    write++;
                }
            }
            read++;
        }
        return count;

    }
}