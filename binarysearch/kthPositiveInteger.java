public class kthPositiveInteger{
    public static int findKthPosition(int[] arr, int k){
        int low = 1;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        //or low + k;
        return high + 1 + k;
    }
}