import java.util.*;

public class combinationSum2 {
    public List<List<Integer>> combinationSumII(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] arr, int target, int index, List<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = index; i < arr.length; i++){

            if(i > index && arr[i] == arr[i - 1]) continue;

            if(i > target) break;

            curr.add(arr[i]);
            backtrack(arr, target - arr[i], index + 1, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
