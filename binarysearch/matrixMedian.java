public class matrixMedian{
    public int findMedian(int[][] mat){
        int C = mat[0].length;
        int R = mat.length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i < R; i++){
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][C - 1]);
        }

        int req = ((R * C) + 1) /2;
        while(low < high){
            int mid = low + (high - low)/2;
            int count = 0;
            for(int i = 0; i < R; i++){
                count += upperBound(mat[i], mid);
            }

            if(count < req){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return low;
    }

    public int upperBound(int[] row, int m){
        int low = 0, high = row.length;
        while(low < high){
            int mid = low + (high - low)/2;

            if(row[mid] <= m) low = mid + 1;
            else high = mid;
        }

        return low;
    }
}