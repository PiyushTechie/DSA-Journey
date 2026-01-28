public class rowWithMax1s {
    public int rowWithMax1(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int rowIndex = -1;
        int maxOnes = 0;

        for(int i = 0; i < n; i++){
            int firstOne = firstOne(mat[i], m);

            if(firstOne != -1){
                int onesCount = m - firstOne;
                if(onesCount > maxOnes){
                    maxOnes = onesCount;
                    rowIndex = i;
                }
            }
        }

        return rowIndex;
    }

    public int firstOne(int[] arr, int m){
        int low = 0, high = m - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == 1){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
