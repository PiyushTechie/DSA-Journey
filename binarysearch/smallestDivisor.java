import java.util.*;
public class smallestDivisor{
    public int smallestDivisor(int[] arr, int threshold){
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(sumOfD(arr, mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int sumOfD(int[] arr, int mid){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.ceil((double) arr[i] / (double) mid);
        }

        return sum;
    }
}