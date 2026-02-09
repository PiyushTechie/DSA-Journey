import java.util.ArrayList;

public class generateAllBinaryString{
    public ArrayList<String> binstr(int n){
        ArrayList<String> ans = new ArrayList<>();
        generate(n, "", ans);
        return ans;
    }

    private void generate(int n, String curr, ArrayList<String> ans){
        if(curr.length() == n){
            ans.add(curr);
            return;
        }

        generate(n, curr + "0", ans);
        generate(n, curr + "1", ans);
    }
}