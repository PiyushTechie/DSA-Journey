public class findMinInRotatedSortedArray2 {
    public int findMin(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[low] < arr[high]){
                high = mid;
            }else if(arr[mid] > arr[high]){
                low = mid + 1;
            }else{
                high--;
            }
        }

        return arr[low];
    }
}
