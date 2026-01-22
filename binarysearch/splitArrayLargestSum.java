
import java.util.Arrays;

public class splitArrayLargestSum {
    public int splitArray(int[] arr, int k){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int ans = -1;
        int n = arr.length;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(arr, n, k , mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public boolean isPossible(int[] arr, int n, int k, int maxAllowed){
        int count = 1, total = 0;
        for(int i = 0; i < n; i++){
            if(total + arr[i] <= maxAllowed){
                total += arr[i];
            }else{
                count++;
                total = arr[i];
            }
        }

        return count <= k ? true: false;
    }
}
