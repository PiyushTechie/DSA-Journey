public class bookAllocation {
    public int bookAllocate(int[] arr, int k){
        int n = arr.length;
        if(n > k) return -1;
        int low = 0;
        int high= 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(arr, n, k ,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
    public boolean isPossible(int[] arr, int n, int k, int maxAllowed){
        int students = 1, pages = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > maxAllowed){
                return false;
            }

            if(pages + arr[i] <= maxAllowed){
                pages += arr[i];
            }else{
                students++;
                pages = arr[i];
            
            }
        }

        return students > k ? false:true;
    }
}
