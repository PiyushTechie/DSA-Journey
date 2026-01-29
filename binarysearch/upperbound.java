public class upperbound {
    public static int upperbound(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] <= target){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return low;
    }
}
