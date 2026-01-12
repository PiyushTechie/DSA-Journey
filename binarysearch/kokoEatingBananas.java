import java.util.*;
public class kokoEatingBananas{
    public static int kokoEat(int[] arr, int h){
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        while(low <= high){
            int mid = low + (high - low)/2;
            int totalHours = hours(arr, mid);
            if(totalHours <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static int hours(int[] arr, int mid){
        int totalHours = 0;
        for(int i = 0; i < arr.length; i++){
            totalHours += Math.ceil((double)arr[i]/mid);
        }
        return totalHours;   
    }

}