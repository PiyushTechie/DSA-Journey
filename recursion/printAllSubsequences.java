import java.util.ArrayList;

public class printAllSubsequences {
    public static ArrayList<String> subsequences(String str){
        ArrayList<String> ans = new ArrayList<>();
        backtrack(str, "", 0, ans);
        return ans;
    }
    
    private static void backtrack(String str, String output, int index, ArrayList<String> ans){
        if(index == str.length()){
            if(!output.isEmpty()){
                ans.add(output);
            }

            return;
        }
        //Exclude
        backtrack(str, output, index+1, ans);

        //Include
        backtrack(str, output + str.charAt(index), index + 1, ans);
    }

}
