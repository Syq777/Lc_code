import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {
    class Solution {
        public List<String> generateParenthesis(int n) {
            //括号匹配、不能重复使用
            //可以生成左括号的前提：左仍有剩余
            //可生成右的前提是：剩余的右严格大于左
            List<String> res = new ArrayList<>();
            if (n == 0) {
                return res;
            }
            dfs("", n, n, res);
            return res;
        }

        private void dfs(String curStr, int left, int right, List<String> res) {
            if (left == 0 && right == 0) {
                res.add(curStr);
                return;
            }
            if (left > right) {
                return;
            }
            if (left > 0) {
                dfs(curStr + "(", left - 1, right, res);
            }
            if (right > 0) {
                dfs(curStr + ")", left, right - 1, res);
            }
        }
    }
}