package binarysearch;

public class findKthRoot {
    public static int findRoot(int n, int m){
        if(m == 0) return 0;
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = low + (high - low)/2;
            int midN = func(mid, n, m);
            if(midN == 1){
                return mid;
            }else if(midN == 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int func(int mid, int n, int m){
        long ans = 1L;
        for(int i = 0; i < n; i++){
            ans = ans * mid;
            if(ans > m) return 2;
        }

        if (ans == m) return 1;
        return 0;
    }
}
