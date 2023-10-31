import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    String[]  letters = {"abc","def","ghi","jkl","mno","pars","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return res;
        }
        StringBuffer sb = new StringBuffer();
        dfs(digits,0,sb);
        return res;
    }

    private void dfs(String digits, int index, StringBuffer sb) {
        if(index == digits.length()){
            res.add(sb.toString());
            return;
        }
        int l = digits.charAt(index) - '2';  //正好对应 很妙
        for (int i = 0; i < letters[l].length(); i++) {
            sb.append(letters[l].charAt(i));
            dfs(digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }


    public static void main(String[] args) {
        String digits = "23";
        Solution2 solution2 = new Solution2();
        List<String> res = solution2.letterCombinations(digits);
        System.out.println(res);

    }
}
