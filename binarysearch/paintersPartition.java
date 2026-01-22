
import java.util.Arrays;

public class paintersPartition {
    public int splitArray(int[] boards, int k){
        int low = Arrays.stream(boards).max().getAsInt();
        int high = Arrays.stream(boards).sum();
        int ans = -1;
        int n = boards.length;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(boards, n, k , mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public boolean isPossible(int[] boards, int n, int k, int maxAllowed){
        int painters = 1, total = 0;
        for(int i = 0; i < n; i++){
            if(total + boards[i] <= maxAllowed){
                total += boards[i];
            }else{
                painters++;
                total = boards[i];
            }
        }

        return painters <= k ? true: false;
    }
}
