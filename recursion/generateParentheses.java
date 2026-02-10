import java.util.*;
public class generateParentheses {
    public List<String> generateParenthese(int n){
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String curr, int open, int close, int n){
        if(curr.length() == 2 * n){
            ans.add(curr);
            return;
        }

        if(open < n){
            backtrack(ans, curr + "(", open + 1, close, n);
        }

        if(close < open){
            backtrack(ans, curr + ")", open, close + 1, n);
        }
    }
}
