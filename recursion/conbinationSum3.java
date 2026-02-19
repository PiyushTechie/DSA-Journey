import java.util.*;
public class conbinationSum3 {
    public List<List<Integer>> conbinationSum(int k, int n){
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(int start, int k, int sum, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size() == k && sum == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(curr.size() > k && sum < 0) return;

        for(int i = start; i <= 9; i++){
            curr.add(i);
            backtrack(i + 1, k, sum - i, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
