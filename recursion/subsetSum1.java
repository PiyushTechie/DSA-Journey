import java.util.*;
public class subsetSum1 {
    public static ArrayList<Integer> subsetSum(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        backtrack(0, 0, arr, ans);
        Collections.sort(ans);
        return ans;
    }

    public static void backtrack(int index, int sum, int[] arr, ArrayList<Integer> ans){
        if(index == arr.length){
            ans.add(sum);
            return;
        }
        
        backtrack(index + 1, sum + arr[index], arr, ans);
        backtrack(index + 1, sum, arr, ans);
    }
}
