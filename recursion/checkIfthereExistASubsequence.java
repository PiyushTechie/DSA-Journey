public class checkIfthereExistASubsequence {
    public static boolean checkSubsequence(int[] arr, int k){
        return helper(0, 0, arr, k);
    }

    //Soln only for positive numbers to pass test cases using pruning technique
    public static boolean helper(int index, int sum, int[] arr, int k){
        if(sum == k) return true;

        if(index == arr.length || sum > k) return false;

        if(helper(index + 1, sum + arr[index], arr, k)){
            return true;
        }

        return helper(index + 1, sum, arr, k);
    }
}