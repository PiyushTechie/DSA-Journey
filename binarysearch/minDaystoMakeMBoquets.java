import java.util.*;
public class minDayatoMakeBoquets{
    public static int minDays(int[] bloomDays, int m, int k){
        if((long) m * k > bloomDays.length) return -1;

        int low = Arrays.stream(bloomDays).min().getAsInt();
        int high = Arrays.stream(bloomDays).max().getAsInt();
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(possible(bloomDays, m, k, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
                
            }
        }

        return ans;
    }

    public static boolean possible(int[] bloomDays, int m, int k, int mid){
        int noOfBoquets = 0;
        int count = 0;

        for(int i = 0; i < bloomDays.length; i++){
            if(bloomDays[i] <= mid){
                count++;
            }else{
                noOfBoquets += count/k;
                count = 0;
            }   
        }

        noOfBoquets += count/k;

        return noOfBoquets >= m;
    }
}