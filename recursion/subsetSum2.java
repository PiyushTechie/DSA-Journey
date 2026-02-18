import java.util.*;
public class subsetSum2{
    public ArrayList<ArrayList<Integer>> uniqueSubsets(int[] arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        backtrack(0, arr, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(int index, int[] arr, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(temp));

        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i - 1]) continue;

            temp.add(arr[i]);
            backtrack(index + 1, arr, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}