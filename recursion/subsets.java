import java.util.*;
public class subsets{
    public List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        backtrack(arr, output, 0, ans);
        return ans;
    }

    private void backtrack(int[] arr, List<Integer> output, int index, List<List<Integer>> ans){
        if(index >= arr.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        backtrack(arr, output, index + 1, ans);

        output.add(arr[index]);
        backtrack(arr, output, index + 1, ans);

        output.remove(output.size() - 1);
        
    }
}