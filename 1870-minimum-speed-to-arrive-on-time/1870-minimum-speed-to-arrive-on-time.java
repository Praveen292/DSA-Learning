class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        int low = 1;
        int high = 10000000;
        int ans = -1;
       

        while(low <= high){
            int mid = low +(high - low)/2;
            double sum = 0;
            double hr=0;      
            for(int i=0;i<n;i++){
                hr = (double)dist[i]/mid;
            
              if(i < n-1){
                sum += Math.ceil(hr);
            }
            else{
                sum += hr;
            }
            }
            if(sum <= hour){
                ans = mid;
                high   = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;

    }
}