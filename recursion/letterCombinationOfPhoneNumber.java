import java.util.*;
public class letterCombinationOfPhoneNumber {
    public List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }

        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve(0, new StringBuilder(), digits, mapping, ans);
        return ans;
    }

    public void solve(int index, StringBuilder output, String digits, String[] mapping, List<String> ans){
        if(index == digits.length()){
            ans.add(output.toString());
            return;
        }

        int number = digits.charAt(index) - '0';
        String letters = mapping[number];

        for(int i = 0; i < letters.length(); i++){
            output.append(letters.charAt(i));
            solve(index + 1, output, digits, mapping, ans);
            output.deleteCharAt(letters.length() - 1);
        }
    }
}
