import java.util.*;
public class aggressiveCows {
    public static int aggCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int low = 0;
        int n = stalls.length;
        int high = stalls[n - 1] - stalls[0];
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;

            if(isPossible(stalls, n, k, mid)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] stalls, int n, int C, int minAllowed){
        int cows = 1;
        int lastPosition = stalls[0];
        for(int i = 1; i < n; i++){
            if(stalls[i] - lastPosition >= minAllowed){
                cows++;
                lastPosition = stalls[i];
            }

            if(cows == C){
                return true;
            }
        }

        return false;
    }

}
