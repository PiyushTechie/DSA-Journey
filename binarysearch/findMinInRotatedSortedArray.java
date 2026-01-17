public class findMinInRotatedSortedArray {
    public static int findMin(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[low] <= arr[high]){
                ans = Math.min(ans, arr[low]);
                break;
            }

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }else{
                high = mid - 1;
                ans = Math.min(ans, arr[mid]);
            }
        }

        return ans;
    }
}
